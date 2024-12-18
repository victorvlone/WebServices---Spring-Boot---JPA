package com.webservices.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.projeto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
