package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {

    By clickOnPants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By cronusYogaPantClickOnSize32 = By.xpath("//div[@id='option-label-size-143-item-175']");
    By cronusYogaPantClickColourBlack = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By clickOnAddToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By verifyText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By clickOnShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By verifyShopping = By.xpath("//span[@class='base']");
    By verifyCronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By verifyProductSize32 = By.xpath("//dd[contains(text(),'32')]");
    By verifyProductColourBlack = By.xpath("//dd[contains(text(),'Black')]");

    //Click on Pants
    public void clickPants(){
        clickOnElement(clickOnPants);
    }

    //Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    public void productNameCronusYogaPantCLickOnSize32()
    {
        mouseHoverToElement(By.xpath("//a[normalize-space()='Cronus Yoga Pant']"));
        mouseHoverToElementAndClick(cronusYogaPantClickOnSize32);
    }

    //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
    public void productNameCronusYogaPantClickOnColourBlack()
    {
        mouseHoverToElementAndClick(cronusYogaPantClickColourBlack);
    }

    //Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    public void  CronusYogaPantClickAddToCartButton()
    {
        mouseHoverToElementAndClick(clickOnAddToCart);
    }

    // Verify the text You added Cronus Yoga Pant to your shopping cart.
    public void verifyTextMessage()
    {
        verifyText(driver,verifyText,"You added Cronus Yoga Pant to your shopping cart.");
    }

    // Click on ‘shopping cart’ Link into message
    public void shoppingCartLink()
    {
        clickOnElement(clickOnShoppingCart);
    }

    // Verify the text ‘Shopping Cart.'
    public void verifyShoppingCart()
    {
        verifyText(driver,verifyShopping,"Shopping Cart");
    }

    // Verify the product name ‘Cronus Yoga Pant’
    public void verifyProductNameCronusYogaPant()
    {
        verifyText(driver,verifyCronusYogaPant,"Cronus Yoga Pant");
    }

    // Verify the product size ‘32’
    public void verifyProductSize32()
    {
        verifyText(driver,verifyProductSize32,"32");
    }

    // Verify the product colour ‘Black’
    public void verifyProductColourBlack()
    {
        verifyText(driver,verifyProductColourBlack,"Black");
    }

}
