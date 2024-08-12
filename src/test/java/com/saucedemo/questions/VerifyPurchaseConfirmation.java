package com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import com.saucedemo.ui.ConfirmationPage;

public class VerifyPurchaseConfirmation implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return ConfirmationPage.CONFIRMATION_MESSAGE.resolveFor(actor).isVisible();
    }

    public static VerifyPurchaseConfirmation isDisplayed() {
        return new VerifyPurchaseConfirmation();
    }
}
