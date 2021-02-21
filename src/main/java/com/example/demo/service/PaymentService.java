package com.example.demo.service;

import com.example.demo.repository.TransactionAccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
public class PaymentService {

    private static final BigDecimal paymentAmount = new BigDecimal("1.1");
    private final TransactionAccountRepository transactionAccountRepository;

    @Autowired
    public PaymentService(TransactionAccountRepository transactionAccountRepository) {
        this.transactionAccountRepository = transactionAccountRepository;
    }

    public void pay(Long accountId) {
        log.info("Trying to do payment for account {}", accountId);
        doPay(accountId);
        log.info("Done with payment for account {}", accountId);
    }

    private void doPay(Long accountId) {
        var taOpt = transactionAccountRepository.findById(accountId);
        if (taOpt.isEmpty()) {
            log.warn("Transaction account with id {} not found", accountId);
            return;
        }

        var transactionAccount = taOpt.get();
        var balance = transactionAccount.getBalance();
        log.info("Transaction account has balance {}", balance);

        if (balance.compareTo(paymentAmount) < 0) {
            log.error("Balance is smaller than payment amount {}", paymentAmount);
            return;
        }

        var newBalance = balance.subtract(paymentAmount);
        log.info("New balance for account is {}", newBalance);
        transactionAccount.setBalance(newBalance);

        //Add transaction
        transactionAccountRepository.save(transactionAccount);
    }
}
