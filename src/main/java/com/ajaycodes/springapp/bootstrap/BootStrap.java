package com.ajaycodes.springapp.bootstrap;

import com.ajaycodes.springapp.entities.Author;
import com.ajaycodes.springapp.entities.Book;
import com.ajaycodes.springapp.entities.Publisher;
import com.ajaycodes.springapp.repositories.AuthorRepository;
import com.ajaycodes.springapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {
    private final BookRepository bookRepository;

    private final AuthorRepository authorRepository;

    public BootStrap(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Development");
        ddd.setIsbn("12345");

        eric.addBook(ddd);

        Publisher publisher = new Publisher();
        publisher.setAddress("123 Main");
        publisher.setPublisherName("My Publisher");
        publisher.addBook(ddd);
        Book savedEric = bookRepository.save(ddd);
    }
}
