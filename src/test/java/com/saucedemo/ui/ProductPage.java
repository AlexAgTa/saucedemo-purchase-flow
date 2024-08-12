package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {
    public static final Target ADD_TO_CART_BUTTON = Target.the("Add to cart button for {0}")
        .locatedBy("//div[text()='{0}']/ancestor::div[@class='inventory_item']//button");
}
