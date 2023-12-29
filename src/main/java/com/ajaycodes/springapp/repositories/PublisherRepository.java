package com.ajaycodes.springapp.repositories;

import com.ajaycodes.springapp.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}