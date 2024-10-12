package com.exponent_softwares.ultimatejparevisited.entities.subentities;

import com.exponent_softwares.ultimatejparevisited.entities.Resource;
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
@Entity
@EqualsAndHashCode(callSuper = true)
//@DiscriminatorValue("File")
public class File extends Resource {

    private String type;

}
