package com.alvirg.e_learning_platform.models.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OrderId {
    // create an embedded id
    // it's not a persistent entity. It's like the mapped Superclass
    // it's  a composition

    private String username;

    private LocalDateTime orderDate;
}
