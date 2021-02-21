package com.example.demo.controller;

import com.example.demo.service.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//TODO Understand what this test does https://reflectoring.io/spring-boot-web-controller-test/
@WebMvcTest(controllers = PaymentsController.class)
class PaymentsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PaymentService paymentService;

    @Test
    void testCanPingEndpoint() throws Exception {

        doNothing().when(paymentService).pay(any());

        mockMvc.perform(post("/payment/pay?account_id=1"))
                .andExpect(status().isOk());
    }

}