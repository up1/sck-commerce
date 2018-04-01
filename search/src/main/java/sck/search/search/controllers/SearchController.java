package sck.search.search.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@ResponseBody
public class SearchController {
    
    @Autowired    
    public SearchController () {

    }

    @RequestMapping(value = "search/products", method = RequestMethod.GET)
    public String search(@RequestBody String bodyString) throws Exception {
        return "search";
    }
}