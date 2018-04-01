package sck.search.search.service;

import sck.search.search.models.Product;
import sck.search.search.repositories.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    private SearchRepository searchRepository;

	@Autowired
    public void setSearchRepository(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

	
    // public Book save(Book book) {
    //     return bookRepository.save(book);
    // }

    // public void delete(Book book) {
    //     bookRepository.delete(book);
    // }

    // public Book findOne(String id) {
    //     return bookRepository.findOne(id);
    // }

    // public Iterable<Book> findAll() {
    //     return bookRepository.findAll();
    // }

    // public Page<Book> findByAuthor(String author, PageRequest pageRequest) {
    //     return bookRepository.findByAuthor(author, pageRequest);
    // }

    public List<Product> findByBrand(String brand) {
        return searchRepository.findByBrand(brand);
    }

}
