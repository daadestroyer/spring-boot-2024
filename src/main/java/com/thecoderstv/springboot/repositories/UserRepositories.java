package com.thecoderstv.springboot.repositories;

import com.thecoderstv.springboot.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories extends JpaRepository<User,Integer> {
}
