package com.alvirg.e_learning_platform.models.embedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_order")
public class Order {

    // create an instance of OrderId
    @EmbeddedId
    private OrderId id;

    // to tell that this Address is an embeddable entity within my Order entity
    @Embedded
    private Address address;

    private String orderInfo;

    private String anotherField;
}
