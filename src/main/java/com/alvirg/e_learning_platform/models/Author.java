package com.alvirg.e_learning_platform.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Author {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(
            name = "f_name",
            length = 35
    )
    private String firstName;

    @Column(
            name = "l_name",
            length = 35
    )
    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;

    private int age;

}



