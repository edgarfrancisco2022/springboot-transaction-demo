package com.edgarfrancisco2022.springboottransactiondemo.service;

import com.edgarfrancisco2022.springboottransactiondemo.dto.OrderRequest;
import com.edgarfrancisco2022.springboottransactiondemo.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
