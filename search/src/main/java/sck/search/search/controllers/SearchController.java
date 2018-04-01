package sck.search.search.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import sck.search.search.models.Product;

@CrossOrigin(origins = "*")
@RestController
public class SearchController {
    
    @Autowired    
    public SearchController () {

    }

    @GetMapping("search/products")
    public ArrayList<Product> search(@RequestParam("q") String keyword) throws Exception {
        return new ArrayList();
    }
}