package com.example.demo.controller;

import com.example.demo.entity.Transaction;
import com.example.demo.entity.TransactionAccount;
import com.example.demo.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentsController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentsController(PaymentService paymentService) {this.paymentService = paymentService;}

    @PostMapping("/pay")
    public void pay(@RequestParam("account_id") Long accountId){
        log.info("Received request to do payment for {}", accountId);
        paymentService.pay(accountId);
    }

    @GetMapping("/get_log")
    public Set<Transaction> getTransactionByAccount(@RequestParam("transactionAccountId") String transactionAccountId){
        return null;
    }
}
