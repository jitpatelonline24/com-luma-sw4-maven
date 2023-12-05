package com.luma.demo.pages;

import com.luma.demo.utilities.Utility;
import org.openqa.selenium.By;

public class WomenPage extends Utility {
    //Click on Jacket
    By clickOnJacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    public void clickOnJackets(){
        clickOnElement(clickOnJacket);
    }

}
