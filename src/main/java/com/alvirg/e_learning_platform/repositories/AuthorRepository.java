package com.alvirg.e_learning_platform.repositories;

import com.alvirg.e_learning_platform.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    // This query is the equivalent of --> select * from author where first_name = ''
    List<Author> findAllByFirstName(String fn);

    // This query is the equivalent of --> select * from author where first_name = 'al'
    List<Author> findAllByFirstNameIgnoreCase(String fn);

    // This query is the equivalent of --> select * from author where first_name like '%al%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

    // This query is the equivalent of --> select * from author where first_name like 'al%'
    List<Author> findAllByFirstNameStartingWithIgnoreCase(String fn);

    // This query is the equivalent of --> select * from author where first_name like '%al'
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);
}
