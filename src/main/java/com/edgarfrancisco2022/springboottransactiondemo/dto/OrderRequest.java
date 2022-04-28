package com.edgarfrancisco2022.springboottransactiondemo.dto;

import com.edgarfrancisco2022.springboottransactiondemo.entity.Order;
import com.edgarfrancisco2022.springboottransactiondemo.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
