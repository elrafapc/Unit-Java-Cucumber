package com.br.TestedAplication.TestedAplication.cucumber.steps;

import com.br.TestedAplication.TestedAplication.model.Book;
import com.br.TestedAplication.TestedAplication.model.ShoppingCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartSteps {
    Book b1;
    Book b2;
    ShoppingCart cart = new ShoppingCart();

    @Given("I choose two books")
    public void iChooseTwoBooks() {
        b1 = new Book("book1", 10, "1");
        b2 = new Book("book2", 20, "2");
    }

    @When("I add these two books to the cart")
    public void iAddTheseTwoBooksToTheCart() {
        cart.add(b1);
        cart.add(b2);
    }

    @Then("the count of items from cart must be {int}")
    public void theCountOfItemsFromCartMustBe(int arg0) {
        assertEquals(2, cart.countItems());
    }

    @Then("the total must be updated")
    public void theTotalMustBeUpdated() {
        assertEquals(30.0, cart.getTotal());
    }

}
