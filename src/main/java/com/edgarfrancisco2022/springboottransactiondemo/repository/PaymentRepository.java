package com.edgarfrancisco2022.springboottransactiondemo.repository;

import com.edgarfrancisco2022.springboottransactiondemo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
