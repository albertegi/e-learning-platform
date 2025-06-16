package com.alvirg.e_learning_platform.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Section {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int sectionOrder;

    // Owner of the relationship
    @ManyToOne
    @JoinColumn(name = "course_id") // course_id is the foreign key name. from the other Course entity
    private Course course;

    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
}
