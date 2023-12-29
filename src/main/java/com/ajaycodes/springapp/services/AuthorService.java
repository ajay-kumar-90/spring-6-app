package com.ajaycodes.springapp.services;

import com.ajaycodes.springapp.entities.Author;

public interface AuthorService {

   Iterable<Author> findAll();
}
