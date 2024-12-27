package com.food.ordering.system.order.service.domain.ports.input.message.listener.payment;

import com.food.ordering.system.order.service.domain.dto.message.PaymentResponse;

public interface PaymentResponseMessageListener {
    void paymentComplete(PaymentResponse paymentResponse);
    void paymentCancelled(PaymentResponse paymentResponse);
}
