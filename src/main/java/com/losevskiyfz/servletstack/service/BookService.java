package com.losevskiyfz.servletstack.service;

import com.losevskiyfz.servletstack.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface BookService {
    Book save(Book book);

    void delete(String bookId);

    Page<Book> getPaginated(Pageable pageable);

    Optional<Book> findById(String id);
}