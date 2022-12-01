package com.example.walletControll.interfaces.repository;

import com.example.walletControll.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
