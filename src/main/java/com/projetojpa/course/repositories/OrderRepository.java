package com.projetojpa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
