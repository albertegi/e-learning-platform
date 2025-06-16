package com.alvirg.e_learning_platform.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
public class Course extends BaseEntity{

    private String name;

    private String description;

    // Course is considered the owner of th relationship between Author and Course
    // so the mappedBy should be in the Authors
    // define the JoinTable here in the owner
    @ManyToMany
    @JoinTable(
            name = "authors_courses", // the name of the join table is a combination of the names of the two entities in lowercase separated by semicolon
            joinColumns = {@JoinColumn(name = "course_id")},// @JoinColumn(name = "course_id") is the primary key of the owner of the relationship
            // define the inverse join column
            inverseJoinColumns = {@JoinColumn(name = "author_id")} //The foreign key columns of the join table which reference the primary table of the entity that does not own the association.

    )
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;
}
