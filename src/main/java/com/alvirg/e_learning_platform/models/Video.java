package com.alvirg.e_learning_platform.models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@PrimaryKeyJoinColumn(name = "video_id") --> For only for JOINED
//@DiscriminatorValue("V") --> For SINGLE_TABLE
@Polymorphism(type = PolymorphismType.EXPLICIT)
public class Video extends Resource{

    private int videoLength;
}
