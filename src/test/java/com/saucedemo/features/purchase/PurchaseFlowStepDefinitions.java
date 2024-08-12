package com.saucedemo.features.purchase;

import com.saucedemo.tasks.AddToCart;
import com.saucedemo.tasks.CompletePurchaseForm;
import com.saucedemo.tasks.Login;
import com.saucedemo.questions.VerifyPurchaseConfirmation;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class PurchaseFlowStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("user is logged in with username {string} and password {string}")
    public void userIsLoggedIn(String username, String password) {
        OnStage.theActorCalled("User").attemptsTo(
            Login.withCredentials(username, password)
        );
    }

    @When("user adds the following items to the cart:")
    public void userAddsItemsToCart(List<String> items) {
        items.forEach(item -> OnStage.theActorInTheSpotlight().attemptsTo(
            AddToCart.item(item)
        ));
    }

    @And("user completes the purchase form with name {string}, country {string}, city {string}, card {string}, month {string}, and year {string}")
    public void userCompletesThePurchaseForm(String name, String country, String city, String card, String month, String year) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            CompletePurchaseForm.withDetails(name, country, city, card, month, year)
        );
    }

    @Then("the purchase should be successful")
    public void thePurchaseShouldBeSuccessful() {
        OnStage.theActorInTheSpotlight().should(
            seeThat(VerifyPurchaseConfirmation.isDisplayed())
        );
    }
}
