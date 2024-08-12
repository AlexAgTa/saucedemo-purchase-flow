package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import com.saucedemo.ui.CheckoutPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletePurchaseForm implements Task {

    private final String name;
    private final String country;
    private final String city;
    private final String card;
    private final String month;
    private final String year;

    public CompletePurchaseForm(String name, String country, String city, String card, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.card = card;
        this.month = month;
        this.year = year;
    }

    @Step("{0} completes the purchase form")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(name).into(CheckoutPage.NAME_FIELD),
            Enter.theValue(country).into(CheckoutPage.COUNTRY_FIELD),
            Enter.theValue(city).into(CheckoutPage.CITY_FIELD),
            Enter.theValue(card).into(CheckoutPage.CARD_FIELD),
            Enter.theValue(month).into(CheckoutPage.MONTH_FIELD),
            Enter.theValue(year).into(CheckoutPage.YEAR_FIELD),
            Click.on(CheckoutPage.PURCHASE_BUTTON)
        );
    }

    public static CompletePurchaseForm withDetails(String name, String country, String city, String card, String month, String year) {
        return instrumented(CompletePurchaseForm.class, name, country, city, card, month, year);
    }
}
