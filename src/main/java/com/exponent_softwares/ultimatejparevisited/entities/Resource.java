package com.exponent_softwares.ultimatejparevisited.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Discriminator", discriminatorType = DiscriminatorType.STRING, length = 10)
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
            generator = "resource_table"
    )
    @TableGenerator(
            name = "resource_table",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            initialValue = 1,
            allocationSize = 1
    )
    private Integer id;
    private String name;
    private int size;
    private String url;

    @OneToOne
    @JoinColumn(name = "lecturer-id") //BiDirectional relationships makes it difficult to maintain all the foreign keys
    private Lecturer lecturer;
}
