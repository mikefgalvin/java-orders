package com.lambdaschool.ordersapp.services;


import com.lambdaschool.ordersapp.models.Order;
import com.lambdaschool.ordersapp.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "orderServices")
public class OrderServicesImpl implements OrderServices{

    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    @Override
    public Order save(Order order) { return orderRepository.save(order); }
}
