package com.hibernate.HibernateProject.config;

import com.hibernate.HibernateProject.entities.Category;
import com.hibernate.HibernateProject.entities.Order;
import com.hibernate.HibernateProject.entities.User;
import com.hibernate.HibernateProject.repositories.CategoryRepository;
import com.hibernate.HibernateProject.repositories.OrderRepository;
import com.hibernate.HibernateProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9888-8889", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "9999-8889", "123456");

        Order o1 = new Order(null, Instant.parse("2020-11-16T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2020-11-17T19:59:30Z"), u2);
        Order o3 = new Order(null, Instant.parse("2020-11-18T20:53:40Z"), u1);

        Category cat1 = new Category(null, "Electronic");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }

}
