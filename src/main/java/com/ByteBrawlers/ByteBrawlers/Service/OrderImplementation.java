package com.ByteBrawlers.ByteBrawlers.Service;

import com.ByteBrawlers.ByteBrawlers.Model.Orders;
import com.ByteBrawlers.ByteBrawlers.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderImplementation implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderImplementation(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void createOrder(Orders orders) {
        orderRepository.save(orders);
    }
}
