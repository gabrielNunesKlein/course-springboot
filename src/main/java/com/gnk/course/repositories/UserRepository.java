package com.gnk.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gnk.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}