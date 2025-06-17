package com.alvirg.e_learning_platform;

import com.alvirg.e_learning_platform.models.Author;
import com.alvirg.e_learning_platform.models.Video;
import com.alvirg.e_learning_platform.repositories.AuthorRepository;
import com.alvirg.e_learning_platform.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ELearningPlatformApplication {

	public static void main(String[] args) {

		SpringApplication.run(ELearningPlatformApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository,
			VideoRepository videoRepository
	){
		return args -> {
			// create an object of the Author Entity and use the @Builder
			/* var author = Author.builder()
					.firstName("Albert")
					.lastName("Egi")
					.age(37)
					.email("albertegi@gmail.com")
					.build();
			authorRepository.save(author); */
			var video = Video.builder()
					.name("abc")
					.videoLength(5)
					.build();
			videoRepository.save(video);
		};
	}

}
