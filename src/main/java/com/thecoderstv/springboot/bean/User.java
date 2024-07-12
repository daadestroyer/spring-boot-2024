package com.thecoderstv.springboot.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity(name = "user_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    private int userid;
    private String firstname;
    private String lastname;
    private String email;
    private String pincode;
}
