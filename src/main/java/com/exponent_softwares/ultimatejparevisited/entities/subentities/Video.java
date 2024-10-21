package com.exponent_softwares.ultimatejparevisited.entities.subentities;

import com.exponent_softwares.ultimatejparevisited.entities.Resource;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
//@DiscriminatorValue("Video")
//@PrimaryKeyJoinColumn(name = "Video_id") //ONLY WORKS WITH JOINED TABLE INHERITANCE TYPE
@Polymorphism(type = PolymorphismType.EXPLICIT)
public class Video extends Resource {

    private int length;

}