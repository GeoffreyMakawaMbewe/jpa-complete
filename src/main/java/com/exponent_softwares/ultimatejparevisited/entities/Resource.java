package com.exponent_softwares.ultimatejparevisited.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Resource extends BaseEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE,
//            generator = "resource_table"
//    )
//    @TableGenerator(
//            name = "resource_table",
//            pkColumnName = "id_name",
//            valueColumnName = "id_value",
//            initialValue = 1,
//            allocationSize = 1
//    )
//    private Integer id;
    private String name;
    private String url;

    @OneToOne
    @JoinColumn(name = "lecturer-id") //BiDirectional relationships makes it difficult to maintain all the foreign keys
    private Lecturer lecturer;
}
