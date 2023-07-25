package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {
    private static final Logger log = LogManager.getLogger(GearPage.class.getName());
    @CacheLookup
    @FindBy(xpath="//a[normalize-space()='Overnight Duffle']")
    WebElement productGearLink;
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Overnight Duffle')]")
    WebElement actualTextOvernightDuffle;
    @CacheLookup
    @FindBy(xpath="//input[@id='qty']")
    WebElement changeQuantity;
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Add to Cart')]")
    WebElement clickOnAddToCartButton;
    @CacheLookup
    @FindBy(xpath="//div[@class='message-success success message']")
    WebElement actualTextDuffleAdded;
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'shopping cart')]")
    WebElement cilckOnShoppingCartLink;

    public void clickOnOverNightDuffle()
    {
        //1.3 Click on Product Name ‘Overnight Duffle’
        clickOnElement(productGearLink);
        log.info("Click on product name"+ productGearLink.toString());
    }

    public String verifyTextOvernightDuffle()
    {
        //1.4 Verify the text ‘Overnight Duffle’
        String result= getTextFromElement(actualTextOvernightDuffle);
        log.info("Verify the text"+ actualTextOvernightDuffle.toString());
        return result;
    }

    public void GearchangeQuantity(String changeQty)
    {
        //1.5 Change Qty 3
        changeQuantity.clear();
        sendTextToElement(changeQuantity,changeQty);
        log.info("Change Qty"+ changeQuantity.toString());
    }
    public void userClickOnAddToCart()
    {
        //1.6 Click on ‘Add to Cart’ Button.
        clickOnElement(clickOnAddToCartButton);
        log.info("Click on ‘Add to Cart’ Button"+ clickOnAddToCartButton.toString());
    }

    public String verifyTextAddDuffle()
    {
        //1.7 Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String result= getTextFromElement(actualTextDuffleAdded);
        log.info("Verify the text You added Overnight Duffle to your shopping cart."+ actualTextDuffleAdded.toString());
        return result;
    }
    public void clickOnShoppingCart()
    {
        //1.8 Click on ‘shopping cart’ Link into message
        clickOnElement(cilckOnShoppingCartLink);
        log.info(" Click on shopping cart Link into message"+ cilckOnShoppingCartLink.toString());
    }
}
