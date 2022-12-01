package com.example.walletControll.domain;


import com.example.walletControll.enums.OperationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String assetCode;

    @Column(nullable = false)
    private Date transactionDate;

    @Column(nullable = false)
    private OperationType operationType;

    @Column(nullable = false)
    private int quantity;

    @Column
    private float priceOrAdjust;

    @Column
    private float taxes;

    @Column
    private String broker;
}
