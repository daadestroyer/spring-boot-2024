package com.thecoderstv.springboot.repositories;

import com.thecoderstv.springboot.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepositories extends JpaRepository<User, Integer> {
    // custom finder methods to findUserByEmail
    Optional<User> findByEmail(String email);

    // JPQL
    @Query("select u from user_table u where email =:e")
    Optional<User> findByEmailJPQL(@Param("e") String email);

    // Native Query
    @Query(value = "select * from user_table where email = ?1",nativeQuery = true)
    Optional<User> findByEmailNativeQuery(String email);

    // custom finder methods to findUserByFirstAndLastName
    Optional<User> findByFirstnameAndLastname(String firstname, String lastname);

    // JPQL
    @Query("select u from user_table u where firstname =:f and lastname =:l")
    Optional<User> findByFirstnameAndLastnameJPQL(@Param("f") String firstname, @Param("l") String lastname);

    // Native Query
    // custom finder methods to findUserByFirstOrLastName
    @Query(value = "select * from user_table where firstname = ?1 and lastname = ?2",nativeQuery = true)
    Optional<User> findByFirstnameAndLastnameNativeQuery(String firstname,String lastname);

    // custom finder method findByFirstnameOrLastname
    Optional<User> findByFirstnameOrLastname(String firstname, String lastname);

    // JPQL query
    @Query("select u from user_table u where firstname =:f or lastname =:l")
    Optional<User> findByFirstnameOrLastnameJPQL(@Param("f") String firstname, @Param("l") String lastname);

    // Native query
    @Query(value = "select * from user_table where firstname = ?1 or lastname = ?2",nativeQuery = true)
    Optional<User> findByFirstnameOrLastnameNative(String firstname , String lastname);

    // custom finder methods to findUserByFirstNameStartingWith
    List<User> findByFirstnameStartingWith(String firstname);

    // custom finder methods to findUserByLastNameStartingWith
    List<User> findByLastnameEndingWith(String firstname);

    // custom finder methods to findUserByFirstNameContaining
    List<User> findByFirstnameContaining(String firstname);


}
