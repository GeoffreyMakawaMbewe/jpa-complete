package com.exponent_softwares.ultimatejparevisited.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor @NoArgsConstructor @Builder @ToString
@NamedQuery(name = "Authors.findByNamedQuery",
        query = "SELECT a FROM Authors a"
        + " WHERE a.age >= :age "
)
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Integer age;

}
