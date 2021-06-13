package com.br.TestedAplication.TestedAplication.ShoppingCartTests;

import com.br.TestedAplication.TestedAplication.Book;
import com.br.TestedAplication.TestedAplication.ShoppingCart;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetTotalTest {

    void testAddGetTotal() {
        Book b1 = new Book("book1", 10, "1");
        Book b2 = new Book("book2", 20, "2");
        ShoppingCart cart = new ShoppingCart();

        cart.add(b1);
        cart.add(b2);

        assertEquals(30.0, cart.getTotal());
    }
}
