package com.br.TestedAplication.TestedAplication.junit;

import com.br.TestedAplication.TestedAplication.dom.Book;
import com.br.TestedAplication.TestedAplication.dom.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


//dado, quando, então

@SpringBootTest
class ShoppingCartTests {
    Book b1, b2;
    ShoppingCart cart;

    @BeforeEach
    void setUp() {
        b1 = new Book("book1", 10, "1");
        b2 = new Book("book2", 20, "2");

        cart = new ShoppingCart();
    }

    @Test
    void testAddGetTotal() {
        cart.add(b1);
        cart.add(b2);
        assertEquals(30.0, cart.getTotal());
    }
}
