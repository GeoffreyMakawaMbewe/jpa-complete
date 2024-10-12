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
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
            generator = "section_table"
    )
    @TableGenerator(
            table = "section_table",
            name = "section_table",
            pkColumnName = "section_id",
            valueColumnName = "section_name",
            initialValue = 1,
            allocationSize = 1
    )
    private Integer id;
    private String name;
    private int sectionOrder;

    @ManyToOne()
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "section")
    private List<Lecturer> lecturerList;

}
