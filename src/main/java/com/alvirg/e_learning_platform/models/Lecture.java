package com.alvirg.e_learning_platform.models;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
public class Lecture extends BaseEntity {

    private String name;

    // Owner of the relationship
    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    // owner of this relationship
    @OneToOne
    @JoinColumn(name = "resouce_id") // resource_id is the foreign key from Resource Entity
    private Resource resource;
}
