package com.luma.demo.testsuite;

import com.luma.demo.pages.HomePage;
import com.luma.demo.pages.MenPage;
import com.luma.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    MenPage menPage = new MenPage();
    HomePage homePage= new HomePage();

    @Test
    public void userShouldAddProductSuccessfullyToShoppingCart(){

        homePage.mouseHoverMenMenu();
        homePage.mouseHoverBottom();
        menPage.clickPants();
        menPage.productNameCronusYogaPantCLickOnSize32();
        menPage.productNameCronusYogaPantClickOnColourBlack();
        menPage.CronusYogaPantClickAddToCartButton();
        menPage.verifyTextMessage();
        menPage.shoppingCartLink();
        menPage.verifyShoppingCart();
        menPage.verifyProductNameCronusYogaPant();
        menPage.verifyProductSize32();
        menPage.verifyProductColourBlack();
    }

}
