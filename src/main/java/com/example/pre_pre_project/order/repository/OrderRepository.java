package com.example.pre_pre_project.order.repository;

import com.example.pre_pre_project.order.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
