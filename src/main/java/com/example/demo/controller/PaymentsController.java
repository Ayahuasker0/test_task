package com.example.demo.controller;

import com.example.demo.entity.Transaction;
import com.example.demo.entity.TransactionAccount;
import com.example.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/payment")
public class PaymentsController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentsController(PaymentService paymentService) {this.paymentService = paymentService;}

    @PostMapping("/pay")
    public void pay(@RequestParam TransactionAccount transactionAccount){
        PaymentService.pay();
    }

    @GetMapping("/get_log")
    public Set<Transaction> getTransactionByAccount(@RequestParam("transactionAccountId") String transactionAccountId){
        return null;
    }
}
