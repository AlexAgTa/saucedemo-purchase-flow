package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationPage {
    public static final Target CONFIRMATION_MESSAGE = Target.the("confirmation message")
        .located(By.xpath("//h2[contains(text(), 'THANK YOU FOR YOUR ORDER')]"));
}
