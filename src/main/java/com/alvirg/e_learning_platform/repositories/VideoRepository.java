package com.alvirg.e_learning_platform.repositories;

import com.alvirg.e_learning_platform.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
