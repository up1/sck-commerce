package sck.search.search.service;

import sck.search.search.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface SearchService {

    // Book save(Book book);

    // void delete(Book book);

    // Book findOne(String id);

    // Iterable<Book> findAll();

    // Page<Book> findByAuthor(String author, PageRequest pageRequest);


    List<Product> findByBrand(String brand)

    // List<Book> findByTitle(String title);

}
