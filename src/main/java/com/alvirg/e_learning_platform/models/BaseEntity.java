package com.alvirg.e_learning_platform.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue
    private Integer id;


    private LocalDateTime createdAt;

    private LocalDateTime lastModified;

    private String createdBy;

    private String lastModifiedBy;


}
