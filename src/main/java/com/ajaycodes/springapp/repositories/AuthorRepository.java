package com.ajaycodes.springapp.repositories;

import com.ajaycodes.springapp.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}