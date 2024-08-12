package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target CART_ITEM = Target.the("item in the cart")
        .locatedBy("//div[@class='cart_item_label']//div[text()='{0}']");
    public static final Target CHECKOUT_BUTTON = Target.the("checkout button")
        .located(By.id("checkout"));
}
