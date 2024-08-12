package com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class VerifyItemsInCart implements Question<Boolean> {

    private final List<String> expectedItems;

    public VerifyItemsInCart(List<String> expectedItems) {
        this.expectedItems = expectedItems;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return expectedItems.stream().allMatch(item -> 
            Target.the("Cart item " + item).locatedBy("//div[@class='inventory_item_name' and text()='{0}']").resolveFor(actor).isVisible());
    }

    public static VerifyItemsInCart matches(List<String> expectedItems) {
        return new VerifyItemsInCart(expectedItems);
    }
}
