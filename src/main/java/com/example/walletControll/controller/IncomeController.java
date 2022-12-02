package com.example.walletControll.controller;

import com.example.walletControll.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Income")
public class IncomeController {

    @Autowired
    private IncomeService incomeService;
}
