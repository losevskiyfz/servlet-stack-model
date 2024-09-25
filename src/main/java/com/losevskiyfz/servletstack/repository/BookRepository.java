package com.losevskiyfz.servletstack.repository;

import com.losevskiyfz.servletstack.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

}
