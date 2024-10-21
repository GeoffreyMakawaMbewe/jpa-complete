package com.exponent_softwares.ultimatejparevisited.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Embeddable
public class Address {

    private String streetName;
    private String houseNumber;
    private String zipCode;

}
