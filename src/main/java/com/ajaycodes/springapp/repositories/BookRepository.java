package com.ajaycodes.springapp.repositories;

import com.ajaycodes.springapp.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}