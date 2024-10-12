package com.exponent_softwares.ultimatejparevisited.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import java.util.List;

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
    @GeneratedValue(
            strategy = GenerationType.TABLE,
            generator = "author_table"
    )
    @TableGenerator(
            name = "author_table",
            table = "id_generator",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            initialValue = 1,
            allocationSize = 1
    )

//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "author_sequence"
//    )
//    @SequenceGenerator(
//            name = "author_sequence",
//            sequenceName = "author_sequence",
//            allocationSize = 1
//    )
    private Integer id;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    @Positive(message = "Age should be greater than 0")
    private int age;


    //RELATIONSHIP DEFINITION
    private List<Course> courseList;


}
