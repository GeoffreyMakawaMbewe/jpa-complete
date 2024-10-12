package com.exponent_softwares.ultimatejparevisited.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Lecturer {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
            generator = "lecturer_table"
    )
    @TableGenerator(
            table = "lecturer_table",
            name = "lecturer_table",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            initialValue = 1,
            allocationSize = 1
    )
    private Integer id;
    private String name;

}
