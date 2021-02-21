package com.example.demo.controller;

import com.example.demo.entity.Transaction;
import com.example.demo.repository.TransactionAccountRepository;
import com.example.demo.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Set;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentsController {

    private final PaymentService paymentService;
    private final TransactionAccountRepository repository;

    @Autowired
    public PaymentsController(PaymentService paymentService, TransactionAccountRepository repository) {
        this.paymentService = paymentService;
        this.repository = repository;
    }

    @PostMapping("/pay")
    public void pay(@RequestParam("account_id") Long accountId) {
        //var transactionAccount = repository.findByUsername(principal.getName());
        //var accountId = transactionAccount.get().getId();
        log.info("Received request to do payment for {}", accountId);

        paymentService.pay(accountId);
    }

    @GetMapping("/get_log")
    public Set<Transaction> getTransactionByAccount(@RequestParam("transactionAccountId") String transactionAccountId) {
        return null;
    }
}
