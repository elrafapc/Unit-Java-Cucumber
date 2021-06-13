package com.br.TestedAplication.TestedAplication;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestedAplicationApplicationTests {

	@Test
	void testAddGetTotal() {
		Book b1 = new Book("book1", 10, "1");
		Book b2 = new Book("book2", 20, "2");
		ShoppingCart cart = new ShoppingCart();

		cart.add(b1);
		cart.add(b2);

		assertEquals(30.0, cart.getTotal());
	}

}
