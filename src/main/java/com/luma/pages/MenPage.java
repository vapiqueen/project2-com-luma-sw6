package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {

    private static final Logger log = LogManager.getLogger(MenPage.class.getName());
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'Cronus Yoga Pant')]")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath="//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement clickOnsize;
    @CacheLookup
    @FindBy(xpath="//div[@id='option-label-color-93-item-49']")
    WebElement clickOnColor;
    @CacheLookup
    @FindBy(xpath="//span[text()='Add to Cart']")
    WebElement clickOnAddToCart;
    @CacheLookup
    @FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement actualText;
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'shopping cart')]")
    WebElement clickOnShoppingCartLink;

    public void verifyUserSelectSize()
    {
        mouseHoverAction(productName, clickOnsize);
        log.info("Click on productName and clickOnsize"+ clickOnsize.toString());
    }

    public void verifyUserClickOnColor()
    {
        // 1.5  Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
        mouseHoverAction(productName,clickOnColor);
        log.info("Click on productName and clickOnColor"+ clickOnColor.toString());
    }

    public void verifyUserClickOnAddToCart()
    {
        // 1.7 Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        mouseHoverAction(productName,clickOnAddToCart);
        log.info("Click on productName and clickOnAddToCart"+ clickOnAddToCart.toString());
    }

    public String verifyTextAddedToCart()
    {
        // 1.8 Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String result= getTextFromElement(actualText);
        log.info("Click on productName and clickOnAddToCart"+ actualText.toString());
        return result;
    }

    public void verifyUserclickOnShoppingCartLink()
    {
        // 1.9 Click on ‘shopping cart’ Link into message
        clickOnElement(clickOnShoppingCartLink);
        log.info("Click on shopping cart"+ clickOnShoppingCartLink.toString());
    }
}
