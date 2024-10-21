package com.exponent_softwares.ultimatejparevisited.embedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "order_table")
public class Order {

    @EmbeddedId
    private OrderId id;

    @Embedded
    private Address address;
    private String orderInfo;
    private String anotherFiled;

}
