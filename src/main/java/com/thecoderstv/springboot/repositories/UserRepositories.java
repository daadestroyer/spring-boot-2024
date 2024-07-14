package com.thecoderstv.springboot.repositories;

import com.thecoderstv.springboot.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepositories extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

    Optional<User> findByFirstnameAndLastname(String firstname, String lastname);
    Optional<User> findByFirstnameOrLastname(String firstname, String lastname);
    List<User> findByFirstnameStartingWith(String firstname);
    List<User> findByLastnameEndingWith(String firstname);
    List<User> findByFirstnameContaining(String firstname);
}
