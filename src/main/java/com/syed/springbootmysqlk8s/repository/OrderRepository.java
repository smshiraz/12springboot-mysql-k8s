package com.syed.springbootmysqlk8s.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syed.springbootmysqlk8s.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}