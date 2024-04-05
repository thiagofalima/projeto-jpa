package com.projetojpa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpa.course.entities.OrderItem;
import com.projetojpa.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
}
