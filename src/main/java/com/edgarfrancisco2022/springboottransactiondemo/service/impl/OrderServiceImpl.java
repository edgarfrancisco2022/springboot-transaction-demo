package com.edgarfrancisco2022.springboottransactiondemo.service.impl;

import com.edgarfrancisco2022.springboottransactiondemo.dto.OrderRequest;
import com.edgarfrancisco2022.springboottransactiondemo.dto.OrderResponse;
import com.edgarfrancisco2022.springboottransactiondemo.entity.Order;
import com.edgarfrancisco2022.springboottransactiondemo.entity.Payment;
import com.edgarfrancisco2022.springboottransactiondemo.exception.PaymentException;
import com.edgarfrancisco2022.springboottransactiondemo.repository.OrderRepository;
import com.edgarfrancisco2022.springboottransactiondemo.repository.PaymentRepository;
import com.edgarfrancisco2022.springboottransactiondemo.service.OrderService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private PaymentRepository paymentRepository;

    public OrderServiceImpl(OrderRepository orderRepository, PaymentRepository paymentRepository) {
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
    }

    @Override
    @Transactional
    public OrderResponse placeOrder(OrderRequest orderRequest) {
        Order order = orderRequest.getOrder();
        order.setStatus("INPROGRESS");
        order.setOrderTrackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();

        if (!payment.getType().equals("DEBIT")) {
            throw new PaymentException("Payment card type do not support");
        }

        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTrackingNumber(order.getOrderTrackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCCESS");

        return orderResponse;
    }


}
