package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Women')]")
    WebElement dropDownWomen;
    @CacheLookup
    @FindBy(xpath="//a[@id='ui-id-9']")
    WebElement dropDownTops;
    @CacheLookup
    @FindBy(xpath="//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement productWomenLink;

    /** Mouse Hover on Men Menu
     * Mouse Hover on Bottoms
     * Click on Pants*/
    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='Men']")
    WebElement dropDownMen;
    @CacheLookup
    @FindBy(xpath="//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement dropDownBottoms;
    @CacheLookup
    @FindBy(xpath="//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement productMenLink;

    /** Mouse Hover on Gear Menu
     * Click on Bags
     * Click on Product Name ‘Overnight Duffle*/
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Gear')]")
    WebElement dropDownGear;
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Bags')]")
    WebElement dropDownBags;
    public void clickOnDropdownWomen()
    {
        mouseHoverActionforThree(dropDownWomen,dropDownTops,productWomenLink);
        log.info("click on women, tops, productsWomenLink"+ productWomenLink.toString());
    }

    public void clickOnDropdownMen()
    {
        mouseHoverActionforThree(dropDownMen,dropDownBottoms,productMenLink);
        log.info("click on men, bottom, productMenLink"+ productMenLink.toString());
    }

    public void clickOnDropdownGear()
    {
        mouseHoverAction(dropDownGear,dropDownBags);
        log.info("click on gear, dropDownBags "+ dropDownBags.toString());
    }
}
