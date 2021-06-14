package com.br.TestedAplication.TestedAplication.junit;

import com.br.TestedAplication.TestedAplication.model.Book;
import com.br.TestedAplication.TestedAplication.model.ShoppingCart;
import org.junit.jupiter.api.Assertions;
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
    void should_verify_count_items(){
        cart.add(b1);
        cart.add(b2);
        assertEquals(2, cart.countItems());
    }

    @Test
    void should_verify_total_value_cart() {
        cart.add(b1);
        cart.add(b2);
        assertEquals(30.0, cart.getTotal());
    }

    @Test
    void should_verify_items_deletions(){
        cart.add(b1);
        cart.add(b2);
        int firstCount = cart.countItems();
        cart.remove(b1);
        Assertions.assertTrue(firstCount > cart.countItems());
    }

    @Test
    void should_verify_clear_cart(){
        cart.add(b1);
        cart.add(b2);
        cart.clear();

        assertEquals(0 , cart.countItems());
        assertEquals(00.0, cart.getTotal());
    }

}
