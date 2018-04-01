package sck.search.search.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import sck.search.search.models.Product;
import sck.search.search.repositories.SearchRepository;

@CrossOrigin(origins = "*")
@RestController
public class SearchController {
    
    @Autowired
    private SearchRepository searchRepository;

    @GetMapping("search/products")
    public List<Product> search(@RequestParam(name = "q") String keyword) {
        if(keyword != null) {
            boolean found = searchRepository.searchBy(keyword);
            if(found) {
                List<Product> foundProducts = new ArrayList<>();
                foundProducts.add(new Product());
                foundProducts.add(new Product());
                return foundProducts;
            } else {
                return new ArrayList();
            }
        }
        return new ArrayList();
    }
}