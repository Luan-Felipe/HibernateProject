package com.hibernate.HibernateProject.repositories;

import com.hibernate.HibernateProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
