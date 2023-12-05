package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    By clickOnBag = By.xpath("//span[normalize-space()='Bags']");
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By verifyOverNightDuffle = By.xpath("//span[@class='base']");
    By changeQty = By.xpath("//input[@id='qty']");
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    By verifyShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartMessage = By.xpath("//a[normalize-space()='shopping cart']");
    By verifyQty3 = By.xpath("//input[@title='Qty']");
    By productPrice$135 = By.xpath("//td[@class='col subtotal']//span[@class='price']");
    By changeQty5to3 = By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]");
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By productPrice$225 = By.xpath("//td[@class='col subtotal']//span[@class='price']");

    // Click on Bags
    public void clickOnBags() {

        clickOnElement(clickOnBag);
        // waitUntilVisibilityOfElementClickable(clickOnBag,20);
    }

    // Click on Product Name ‘Overnight Duffle’
    public void productNameOvernightDuffle() {
        clickOnElement(overnightDuffle);
    }

    // Verify the text ‘Overnight Duffle’
    public void verifyTextOvernightDuffle() {
        verifyText(driver, verifyOverNightDuffle, "Overnight Duffle");
    }

    // Change Qty 3
    public void changeQty3() {
        clearQty(By.xpath("//input[@id='qty']"));
        sendTextToElement(changeQty, "3");
    }

    //Click on ‘Add to Cart’ Button.
    public void addToCart() {
        clickOnElement(addToCartButton);
    }

    // Verify the text ‘You added Overnight Duffle to your shopping cart.’
    public void verifyTextShoppingCart() {
        verifyText(driver, verifyShoppingCart, "\"You added Overnight Duffle to your shopping cart.");
    }

    //Click on ‘shopping cart’ Link into message
    public void shoppingCartLinkMessage() {
        clickOnElement(shoppingCartMessage);
    }

    //Verify the Qty is ‘3’
    public void verifyQty3() {
        verifyText(driver, verifyQty3, "3");
    }

    // Verify the product price ‘$135.00’
    public void productPrice$135() {
        verifyText(driver, productPrice$135, "$135.00");
    }

    //Change Qty to ‘5’
    public void changeQty5() {
        mouseHoverToElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]"));
        clickOnElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]"));
        clearQty(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]"));
        sendTextToElement(changeQty5to3, "5");
    }

    //Click on ‘Update Shopping Cart’ button
    public void updateShoppingCartButton() {
        clickOnElement(updateShoppingCart);
    }

    //Verify the product price ‘$225.00’
    public void productPrice$225() {
        verifyText(driver, productPrice$225, "$225.00");
    }
}
