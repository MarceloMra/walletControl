package com.example.walletControll.domain;


import com.example.walletControll.enums.IncomeType;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "tb_income")
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String assetCode;

    @Column(nullable = false)
    private Date incomeDate;

    @Column(nullable = false)
    private IncomeType incomeType;

    @Column(nullable = false)
    private float incomeValue;

}
