package com.hibernate.HibernateProject.config;

import com.hibernate.HibernateProject.entities.Category;
import com.hibernate.HibernateProject.entities.Order;
import com.hibernate.HibernateProject.entities.Product;
import com.hibernate.HibernateProject.entities.User;
import com.hibernate.HibernateProject.repositories.CategoryRepository;
import com.hibernate.HibernateProject.repositories.OrderRepository;
import com.hibernate.HibernateProject.repositories.ProductRepository;
import com.hibernate.HibernateProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {


        Category cat1 = new Category(null, "Electronic");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of the rings", "Lorem ipsum dolor sit amet, consectetur", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dumies", "Cras fringila convallis sem vel faucibus", 100.99, "");


        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4));

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9888-8889", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "9999-8889", "123456");

        Order o1 = new Order(null, Instant.parse("2020-11-16T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2020-11-17T19:59:30Z"), u2);
        Order o3 = new Order(null, Instant.parse("2020-11-18T20:53:40Z"), u1);



        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }

}
