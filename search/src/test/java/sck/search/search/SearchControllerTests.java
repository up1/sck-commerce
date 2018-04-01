package sck.search.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchControllerTests {

	@Test
	public void validateKeywordIsString() {
		String keyword = "UNIQLO";

	}

	@Test
	public void validateKeywordNotString() {
		int keyword = 1234;

	}

	@Test
	public void generateQueryHaveKeyword(){
		String keyword = "UNIQLO";
	}

	@Test
	public void generateQueryHaveNotKeyword(){
		String keyword = null;

	}

}