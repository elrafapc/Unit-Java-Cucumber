import com.br.TestedAplication.TestedAplication.Book;
import com.br.TestedAplication.TestedAplication.ShoppingCart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetTotalSteps {
    Book b1;
    Book b2;
    ShoppingCart cart = new ShoppingCart();

    @Given("I chosse some books")
    public void iChosseSomeBooks() {
        b1 = new Book("book1", 10, "1");
        b2 = new Book("book2", 20, "2");
    }

    @When("I add these books to the cart")
    public void iAddTheseBooksToTheCart() {
        cart.add(b1);
        cart.add(b2);
    }

    @Then("the total must be updated")
    public void theTotalMustBeUpdated() {
        assertEquals(30.0, cart.getTotal());
    }
}
