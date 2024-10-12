package com.exponent_softwares.ultimatejparevisited.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course{

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
            generator = "course_table"
    )

    @TableGenerator(
            name = "course_table",
            table = "course_table",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            initialValue = 1,
            allocationSize = 1
    )
    private Integer id;
    private String title;
    private String description;

}
