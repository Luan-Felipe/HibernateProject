package com.hibernate.HibernateProject.services;

import com.hibernate.HibernateProject.entities.Product;
import com.hibernate.HibernateProject.entities.User;
import com.hibernate.HibernateProject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id){
       Optional<Product> obj = repository.findById(id);
       return obj.get();
    }
}
