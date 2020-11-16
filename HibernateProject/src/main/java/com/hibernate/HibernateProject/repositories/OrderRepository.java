package com.hibernate.HibernateProject.repositories;

import com.hibernate.HibernateProject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
