package sck.search.search.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import sck.search.search.repositories.SearchRepository;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = SearchController.class)
public class SearchControllerTest {

    @MockBean
    private SearchRepository searchRepository;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void search_with_xxx_should_return_200() throws Exception {
        when(searchRepository.searchBy("xxx"))
                .thenReturn(true);

        mockMvc.perform(get("/search/products?q=xxx"))
                .andExpect(status().is(200));
    }

    @Test
    public void search_with_null_should_return_200() throws Exception {
//        when(searchRepository.searchBy(null))
//                .thenReturn(false);

        mockMvc.perform(get("/search/products?q="))
                .andDo(print())
                .andExpect(status().is(200));
    }

}