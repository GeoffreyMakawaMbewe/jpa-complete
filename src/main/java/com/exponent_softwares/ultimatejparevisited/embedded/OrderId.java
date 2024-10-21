package com.exponent_softwares.ultimatejparevisited.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Data
public class OrderId implements Serializable {

    private String username;
    private LocalDateTime orderDate;

}
