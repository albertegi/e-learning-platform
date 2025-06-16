package com.alvirg.e_learning_platform.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Lecture {

    @Id
    @GeneratedValue
    private Integer id;

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
