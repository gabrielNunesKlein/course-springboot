package com.gnk.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gnk.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}