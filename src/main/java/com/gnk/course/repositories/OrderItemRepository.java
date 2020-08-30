package com.gnk.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gnk.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}