package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import com.saucedemo.ui.ProductPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddToCart implements Task {

    private final String itemName;

    public AddToCart(String itemName) {
        this.itemName = itemName;
    }

    @Step("{0} adds #itemName to the cart")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(ProductPage.ADD_TO_CART_BUTTON.of(itemName))
        );
    }

    public static AddToCart item(String itemName) {
        return instrumented(AddToCart.class, itemName);
    }
}
