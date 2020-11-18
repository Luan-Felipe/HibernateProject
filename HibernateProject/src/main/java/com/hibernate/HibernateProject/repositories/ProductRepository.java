package com.hibernate.HibernateProject.repositories;

import com.hibernate.HibernateProject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
