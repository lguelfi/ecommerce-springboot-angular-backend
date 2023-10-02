package com.leonardo.ecommerce.dto;

import java.util.Set;

import com.leonardo.ecommerce.entities.Address;
import com.leonardo.ecommerce.entities.Customer;
import com.leonardo.ecommerce.entities.Order;
import com.leonardo.ecommerce.entities.OrderItem;

import lombok.Data;

@Data
public class Purchase {
    
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
