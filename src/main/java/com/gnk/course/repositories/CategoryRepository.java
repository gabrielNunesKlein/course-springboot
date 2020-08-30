package com.gnk.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gnk.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}