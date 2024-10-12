package com.exponent_softwares.ultimatejparevisited;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Validated
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private int age;



}
