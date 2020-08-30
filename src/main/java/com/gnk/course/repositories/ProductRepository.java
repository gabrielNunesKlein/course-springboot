package com.gnk.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gnk.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}