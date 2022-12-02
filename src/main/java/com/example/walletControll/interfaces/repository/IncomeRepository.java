package com.example.walletControll.interfaces.repository;

import com.example.walletControll.domain.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}
