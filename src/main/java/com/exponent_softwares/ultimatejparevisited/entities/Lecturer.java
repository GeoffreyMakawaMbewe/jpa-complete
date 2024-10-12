package com.exponent_softwares.ultimatejparevisited.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class Lecturer extends BaseEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE,
//            generator = "lecturer_table"
//    )
//    @TableGenerator(
//            table = "lecturer_table",
//            name = "lecturer_table",
//            pkColumnName = "id_name",
//            valueColumnName = "id_value",
//            initialValue = 1,
//            allocationSize = 1
//    )
//    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;

}
