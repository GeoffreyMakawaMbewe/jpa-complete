package com.exponent_softwares.ultimatejparevisited.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Validated
public class Author extends BaseEntity{

//    @Id
//    @GeneratedValue(
//            strategy = GenerationType.TABLE,
//            generator = "author_table"
//    )
//    @TableGenerator(
//            name = "author_table",
//            table = "author_table",
//            pkColumnName = "id_name",
//            valueColumnName = "id_value",
//            initialValue = 1,
//            allocationSize = 1
//    )

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
    @ManyToMany(mappedBy = "authorList")  //Author is the inverse of course-author relationship
    private List<Course> courseList;


}
