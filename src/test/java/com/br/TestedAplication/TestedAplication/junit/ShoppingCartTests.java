package com.br.TestedAplication.TestedAplication.junit;

import com.br.TestedAplication.TestedAplication.dom.Book;
import com.br.TestedAplication.TestedAplication.dom.ShoppingCart;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


//dado, quando, então

@SpringBootTest
class ShoppingCartTests {

    @Test
    void testAddGetTotal() {
        //Dado que escolho dois livros
        Book b1 = new Book("book1", 10, "1");
        Book b2 = new Book("book2", 20, "2");

        //Quando adiciono ao Carrinho
        ShoppingCart cart = new ShoppingCart();

        cart.add(b1);
        cart.add(b2);

        //Então o resultado esperado é
        assertEquals(30.0, cart.getTotal());
    }

}
