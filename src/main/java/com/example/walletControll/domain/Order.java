package com.example.walletControll.domain;


import com.example.walletControll.enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String assetCode;

    @Column(nullable = false)
    private Date transactionDate;

    @Column(nullable = false)
    private OperationType operationType;

    @Column(nullable = false)
    private int quantity;

    private float priceOrAdjust;

    private float taxes;

    private String broker;
}
