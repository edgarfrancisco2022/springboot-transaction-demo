package com.edgarfrancisco2022.springboottransactiondemo.repository;

import com.edgarfrancisco2022.springboottransactiondemo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
