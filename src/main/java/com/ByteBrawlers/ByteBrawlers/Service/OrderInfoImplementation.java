package com.ByteBrawlers.ByteBrawlers.Service;

import com.ByteBrawlers.ByteBrawlers.Model.OrderDetails;
import com.ByteBrawlers.ByteBrawlers.Repository.OrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoImplementation implements OrderInfoService {

    @Autowired
    private OrderInfoRepository orderInfoRepository;

    public OrderInfoImplementation(OrderInfoRepository orderInfoRepository) {
        this.orderInfoRepository = orderInfoRepository;
    }


    @Override
    public void createOrderInfo(OrderDetails orderDetails) {
        orderInfoRepository.save(orderDetails);
    }
}
