package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.GlbTraderPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GlbTraderStepdefinition {
    GlbTraderPage page = new GlbTraderPage();

    @Given("user is go glbtrader page")
    public void user_is_go_glbtrader_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("glbtraderlink"));

    }

    @Given("user verifies {string} is present")
    public void user_verifies_is_present(String string) {
        String actual = page.sellerSignInBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies join {string} is present")
    public void user_verifies_join_is_present(String string) {
        String actual = page.sellerJoinBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies about us {string} is present")
    public void user_verifies_about_us_is_present(String string) {
        String actual = page.aboutUsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies that {string} is present")
    public void user_verifies_that_is_present(String string) {
        String actual = page.returnPolicyBox.getText();
        Assert.assertEquals(string, actual);


    }

    @Given("user verifies contact us {string} is present")
    public void user_verifies_contact_us_is_present(String string) {
        String actual = page.contactUsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @When("uuser verifies package {string} is present")
    public void uuser_verifies_package_is_present(String string) {
        String actual = page.packageBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Then("user is select {string} in dropbox")
    public void user_is_select_in_dropbox(String string) {
        Select select = new Select(page.SelectDropBox);
        select.selectByVisibleText(string);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(string, "Furniture");
        System.out.println("Test Passed");

        softAssert.assertAll();


    }

    @Given("user verifies {string} under the categories")
    public void user_verifies_under_the_categories(String string) {
        String actual = page.menClothingBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies women {string} under the categories")
    public void user_verifies_women_under_the_categories(String string) {
        String actual = page.womenClothingBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies jewelry {string} under the categories")
    public void user_verifies_jewelry_under_the_categories(String string) {
        String actual = page.jewelryBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies cellphone {string} under the categories")
    public void user_verifies_cellphone_under_the_categories(String string) {
        String actual = page.cellphoneBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies computer {string} under the categories")
    public void user_verifies_computer_under_the_categories(String string) {
        String actual = page.computerBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verfies consumer {string} under the categories")
    public void user_verfies_consumer_under_the_categories(String string) {
        String actual = page.consumerBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies tops {string} under the men clothing")
    public void user_verifies_tops_under_the_men_clothing(String string) {
        String actual = page.menClothingTopsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies hoodies {string} under the men clothing")
    public void user_verifies_hoodies_under_the_men_clothing(String string) {
        String actual = page.menClothingHoodiesBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies jacket {string} under the men clothing")
    public void user_verifies_jacket_under_the_men_clothing(String string) {
        String actual = page.menClothingJacketsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies pants {string} under the men clothing")
    public void user_verifies_pants_under_the_men_clothing(String string) {
        String actual = page.menClothingPantsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies shirts {string} under the men clothing")
    public void user_verifies_shirts_under_the_men_clothing(String string) {
        String actual = page.menClothingShirtsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies jeans {string} under the men clothing")
    public void user_verifies_jeans_under_the_men_clothing(String string) {
        String actual = page.menClothingJeansBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies accessories {string} under the men clothing")
    public void user_verifies_accessories_under_the_men_clothing(String string) {
        String actual = page.menClothingAccessoriesBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies dresses {string} under the women clothing")
    public void user_verifies_dresses_under_the_women_clothing(String string) {
        String actual = page.womenClothingDressesBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies shirts {string} under the women clothing")
    public void user_verifies_shirts_under_the_women_clothing(String string) {
        String actual = page.womenClothingBlousesBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies hoodies {string} under the women clothing")
    public void user_verifies_hoodies_under_the_women_clothing(String string) {
        String actual = page.womenClothingHoodiesBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies jumpsuits {string} under the women clothing")
    public void user_verifies_jumpsuits_under_the_women_clothing(String string) {
        String actual = page.womenClothingJumpsuitsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies accessories {string} under the women clothing")
    public void user_verifies_accessories_under_the_women_clothing(String string) {
        String actual = page.womenClothingAccessoriesBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies intimates {string} under the women clothing")
    public void user_verifies_intimates_under_the_women_clothing(String string) {
        String actual = page.womenClothingIntimatesBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies earrings {string} under the jewelry")
    public void user_verifies_earrings_under_the_jewelry(String string) {
        String actual = page.jewelryEarringsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies wedding {string} under the jewelry")
    public void user_verifies_wedding_under_the_jewelry(String string) {
        String actual = page.jewelryWeddingsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies fine {string} under the jewelry")
    public void user_verifies_fine_under_the_jewelry(String string) {
        String actual = page.jewelryFineBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies beads {string} under the jewelry")
    public void user_verifies_beads_under_the_jewelry(String string) {
        String actual = page.jewelryBeadsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies necklaces {string} under the jewelry")
    public void user_verifies_necklaces_under_the_jewelry(String string) {
        String actual = page.jewelryNecklacesBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies rings {string} under the jewelry")
    public void user_verifies_rings_under_the_jewelry(String string) {
        String actual = page.jewelryRingsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies bracelets {string} under the jewelry")
    public void user_verifies_bracelets_under_the_jewelry(String string) {
        String actual = page.jewelryBraceletsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies {string} under the cellphones")
    public void user_verifies_under_the_cellphones(String string) {
        String actual = page.cellMobilBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies bags {string} under the cellphones")
    public void user_verifies_bags_under_the_cellphones(String string) {
        String actual = page.cellBagsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies mobile {string} under the cellphones")
    public void user_verifies_mobile_under_the_cellphones(String string) {
        String actual = page.cellAccessoriesBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies parts {string} under the cellphones")
    public void user_verifies_parts_under_the_cellphones(String string) {
        String actual = page.cellPartsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies power {string} under the cellphones")
    public void user_verifies_power_under_the_cellphones(String string) {
        String actual = page.cellPowerBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies {string} under the computer")
    public void user_verifies_under_the_computer(String string) {
        String actual = page.computerTabletsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies office {string} under the computer")
    public void user_verifies_office_under_the_computer(String string) {
        String actual = page.computerOfficeBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies tablet {string} under the computer")
    public void user_verifies_tablet_under_the_computer(String string) {
        String actual = page.computerAccessoriesBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifes storage {string} under the computer")
    public void user_verifes_storage_under_the_computer(String string) {
        String actual = page.computerStorageBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies networking {string} under the computer")
    public void user_verifies_networking_under_the_computer(String string) {
        String actual = page.computerNetWorkingBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Given("user verifies component {string} under the computer")
    public void user_verifies_component_under_the_computer(String string) {
        String actual = page.computerComponentsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @When("user verifies computer {string} under the computer")
    public void user_verifies_computer_under_the_computer(String string) {
        String actual = page.computerPeribheralsBox.getText();
        Assert.assertEquals(string, actual);

    }

    @Then("user assert the {string} test")
    public void user_assert_the_test(String string) {
        page.assertHotProduct.getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(string, "Hot Products");
        System.out.println("Test Passed");

        softAssert.assertAll();

    }

}