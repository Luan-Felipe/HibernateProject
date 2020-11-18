package com.hibernate.HibernateProject.repositories;

import com.hibernate.HibernateProject.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
