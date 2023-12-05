package com.luma.demo.testsuite;

import com.luma.demo.pages.GearPage;
import com.luma.demo.pages.HomePage;
import com.luma.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    GearPage gearPage = new GearPage();
    HomePage homePage = new HomePage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        homePage.mouseHoverOnGearMenu();
        gearPage.clickOnBags();
        gearPage.productNameOvernightDuffle();
        gearPage.verifyTextOvernightDuffle();
        gearPage.changeQty3();
        gearPage.addToCart();
        gearPage.verifyTextShoppingCart();
        gearPage.shoppingCartLinkMessage();
        gearPage.productPrice$135();
        gearPage.changeQty5();
        gearPage.updateShoppingCartButton();
        gearPage.productPrice$225();
    }
}
