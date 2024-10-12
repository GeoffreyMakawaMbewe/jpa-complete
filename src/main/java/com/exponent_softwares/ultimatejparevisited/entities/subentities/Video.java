package com.exponent_softwares.ultimatejparevisited.entities.subentities;

import com.exponent_softwares.ultimatejparevisited.entities.Resource;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("Video")
public class Video extends Resource {

    private int length;

}
