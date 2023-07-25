package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingPage.class.getName());

    @CacheLookup
    @FindBy(xpath="//span[text()='Shopping Cart']")
    WebElement actualTextShoppingCart;
    @CacheLookup
    @FindBy(xpath="//div[@class='product-item-details']//a[text()='Cronus Yoga Pant ']")
    WebElement actualTextCronusPant;
    @CacheLookup
    @FindBy(xpath="//dd[contains(text(),'32')]")
    WebElement actualTextSize;
    @CacheLookup
    @FindBy(xpath="//dd[contains(text(),'Black')]")
    WebElement actualTextColor;


    @CacheLookup
    @FindBy(xpath="/td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement actualTextOvernightDuffleInCart;
    @CacheLookup
    @FindBy(xpath="//input[@class='input-text qty']")
    WebElement actualQuantity;
    @CacheLookup
    @FindBy(xpath="(//span[@class='cart-price']//span)[2]")
    WebElement actualProductPrice;
    @CacheLookup
    @FindBy(xpath="//input[@class='input-text qty']")
    WebElement quantityChangeToFive;
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Update Shopping Cart')]")
    WebElement clickOnUpdateShoppingCart;
    @CacheLookup
    @FindBy(xpath="(//span[@class='cart-price']//span)[2]")
    WebElement actualProductPriceChange;



    public String verifyTextShoppingCart()
    {
        // 1.10 Verify the text ‘Shopping Cart.’
        String result= getTextFromElement(actualTextShoppingCart);
        log.info("Verify the text Shopping Cart."+ actualTextShoppingCart.toString());
        return result;
    }
    public String verifyTextCronusPant()
    {
        // 1.11 Verify the product name ‘Cronus Yoga Pant’
        String result= getTextFromElement(actualTextCronusPant);
        log.info("Verify the product name Cronus Yoga Pant"+ actualTextCronusPant.toString());
        return result;
    }
    public String verifyTextOfSize()
    {
        // 1.12 Verify the product size ‘32’
        String result= getTextFromElement(actualTextSize);
        log.info("Verify the product size "+ actualTextSize.toString());
        return result;
    }

    public String verifyTextOfColor()
    {
        // 1.13 Verify the product colour ‘Black’
        String result= getTextFromElement(actualTextColor);
        log.info("Verify the product colour"+ actualTextColor.toString());
        return result;
    }



    public String verifyTextOvernightDuffle()
    {
        //1.9 Verify the product name ‘Overnight Duffle’
        String result= getTextFromElement(actualTextOvernightDuffleInCart);
        log.info("Verify the product name "+ actualTextOvernightDuffleInCart.toString());
        return result;
    }

    public String verifyQuantity()
    {
        //1.10 Verify the Qty is ‘3’
        String result= getTextFromElement(actualQuantity);
        log.info("Verify the Qty "+ actualQuantity.toString());
        return result;
    }

    public String verifyProductPrice()
    {
        //1.11 Verify the product price ‘$135.00’
        String result= getTextFromElement(actualProductPrice);
        log.info("Verify the product "+ actualProductPrice.toString());
        return result;
    }

    public void changeQuantity(String changeQty)
    {
        //1.12 Change Qty to ‘5’
        quantityChangeToFive.clear();
        sendTextToElement(quantityChangeToFive,changeQty);
        log.info("Change Qty "+ quantityChangeToFive.toString());
    }

    public void clickOnUpdateButton()
    {
        //1.13 Click on ‘Update Shopping Cart’ button
        clickOnElement(clickOnUpdateShoppingCart);
        log.info("Click on Update Shopping Cart button "+ clickOnUpdateShoppingCart.toString());
    }

    public String verifyProductPriceChange()
    {
        //1.14 Verify the product price ‘$225.00’
        String result= getTextFromElement(actualProductPriceChange);
        log.info("Verify the product price "+ actualProductPriceChange.toString());
        return result;
    }
}
