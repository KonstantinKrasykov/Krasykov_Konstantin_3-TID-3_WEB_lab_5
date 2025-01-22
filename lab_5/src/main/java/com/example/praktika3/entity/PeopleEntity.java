package com.example.praktika3.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person")
public class PeopleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    int age;
    String gender;
    String email;
    String phone;
}
