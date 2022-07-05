package com.works.entities;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    @Length(min = 3, max = 13, message = "name en az 3 en fazla 13 karakterden oluşmalıdır.")
    private String name;

    @Length(min = 3, max = 13, message = "surname en az 3 en fazla 13 karakterden oluşmalıdır.")
    private String surname;

    @Email(message = "email istenilen formatta değil")

    @Column(unique = true, length = 150)

    private String email;

    private String password;

}