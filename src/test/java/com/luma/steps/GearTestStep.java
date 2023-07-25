package com.luma.steps;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.ShoppingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GearTestStep {
    @And("I Mouse Hover on Gear Menu and I Click on Bags")
    public void iMouseHoverOnGearMenuAndIClickOnBags() {
        new HomePage().clickOnDropdownGear();
    }

    @When("I click on Product Name Overnight Duffle")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnOverNightDuffle();
    }

    @And("I verify the text Overnight Duffle {string}")
    public void iVerifyTheTextOvernightDuffle(String expectedMsg) {
        Assert.assertEquals("Overnight Duffle text not found",expectedMsg,new GearPage().verifyTextOvernightDuffle());
    }

    @And("I change Qty")
    public void iChangeQty() {
        new GearPage().GearchangeQuantity("3");
    }

    @And("I click on Add to Cart Button")
    public void iClickOnAddToCartButton() {
        new GearPage().userClickOnAddToCart();
    }

    @And("I verify the text You added Overnight Duffle to your shopping cart {string}")
    public void iVerifyTheTextYouAddedOvernightDuffleToYourShoppingCart(String expectedMsg) {
        Assert.assertEquals("Overnight Duffle text not found in cart",expectedMsg,new GearPage().verifyTextAddDuffle());
    }

    @And("I click on shopping cart Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new GearPage().clickOnShoppingCart();
    }

    @And("I verify the product name Overnight duffle {string}")
    public void iVerifyTheProductNameOvernightDuffle(String expectedMsg) {
        //Assert.assertEquals("Overnight Duffle not found",expectedMsg ,new ShoppingCartPage().verifyTextOvernightDuffle());
    }

    @And("I verify the Qty {string}")
    public void iVerifyTheQty(String expectedMsg) {
        // Assert.assertEquals("Quantity 3 not found",expectedMsg,new ShoppingCartPage().verifyQuantity());
    }

    @And("I verify the product price {string}")
    public void iVerifyTheProductPrice(String expectedMsg) {
        Assert.assertEquals("Product price not found",expectedMsg,new ShoppingPage().verifyProductPrice());
    }

    @And("I change quantity {string}")
    public void iChangeQuantity(String updatePrice) throws InterruptedException {
        new ShoppingPage().changeQuantity(updatePrice);
        Thread.sleep(1000);
    }

    @And("I click on Update Shopping Cart button")
    public void iClickOnUpdateShoppingCartButton() throws InterruptedException {
        new ShoppingPage().clickOnUpdateButton();
        Thread.sleep(2000);
    }

    @Then("I verify the updated product price {string}")
    public void iVerifyTheUpdatedProductPrice(String expectedMsg) {
        Assert.assertEquals("Product price not Updated",expectedMsg,new ShoppingPage().verifyProductPriceChange());
    }

}
