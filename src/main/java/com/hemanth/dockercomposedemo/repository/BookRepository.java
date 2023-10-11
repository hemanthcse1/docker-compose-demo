package com.hemanth.dockercomposedemo.repository;

import com.hemanth.dockercomposedemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
