package com.leonardo.ecommerce.service;

import com.leonardo.ecommerce.dto.PaymentInfo;
import com.leonardo.ecommerce.dto.Purchase;
import com.leonardo.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
    
    PurchaseResponse placeOrder(Purchase purchase);
    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
