package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentService {

    public void pay(Long accountId) {
        log.info("Trying to do payment for account {}",accountId);
        doPay(accountId);
        log.info("Done with payment for account {}",accountId);
    }

    private void doPay(Long accountId) {
    }
}
