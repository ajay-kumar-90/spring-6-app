package com.ajaycodes.springapp.services;

import com.ajaycodes.springapp.entities.Book;

public interface BookService {
    Iterable<Book> findAll();
}
