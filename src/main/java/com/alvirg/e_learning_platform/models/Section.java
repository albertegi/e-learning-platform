package com.alvirg.e_learning_platform.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SuperBuilder
@Data
@Entity
public class Section extends BaseEntity {

    private String name;

    private int sectionOrder;

    // Owner of the relationship
    @ManyToOne
    @JoinColumn(name = "course_id") // course_id is the foreign key name. from the other Course entity
    private Course course;

    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
}
