package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WomenPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenPage.class.getName());
    /**
     * 1.4 Select Sort By filter “Product Name”
     * 1.5 Verify the products name display in alphabetical order
     */
    @CacheLookup
    @FindBy(xpath="//div[@class='toolbar-sorter sorter']//select[@id='sorter']")
    WebElement filterProductName;
    @CacheLookup
    @FindBy(xpath="//strong[@class='product name product-item-name']//a")
    List<WebElement> productNameBefore;
    @CacheLookup
    @FindBy(xpath="//strong[@class='product name product-item-name']//a")
    List<WebElement> productNameAfter;
    public void selectAndVerifySortByFilterProductName()
    {
        // Import this verification method from Utility class
        listOfElementVerify(productNameBefore, filterProductName, "Product Name", productNameAfter);
        log.info("verify the sortBy filter"+ productNameBefore.toString());
    }

    /**
     2.4 Select Sort By filter “Price”
     2.5 Verify the products price display in Low to High
     */
    @CacheLookup
    @FindBy(xpath="//div[@class='toolbar-sorter sorter']//select[@id='sorter']")
    WebElement filterWithPrice;
    @CacheLookup
    @FindBy(xpath="//span[@class='price-container price-final_price tax weee']")
    List<WebElement> productBefore;
    @CacheLookup
    @FindBy(xpath="//span[@class='price-container price-final_price tax weee']")
    List<WebElement> productAfter;
    public void selectAndVerifySortByPrice()
    {
        // Import this verification method from Utility class
        listOfElementVerify(productBefore,filterWithPrice,"Price",productAfter);
        log.info("click on sort by"+ productAfter.toString());
    }
}
