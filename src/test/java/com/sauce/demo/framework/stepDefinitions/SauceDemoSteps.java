package com.sauce.demo.framework.stepDefinitions;

import com.sauce.demo.framework.pageObjects.LoginPage;
import com.sauce.demo.framework.pageObjects.ProductsPage;
import com.sauce.demo.framework.webDriver.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class SauceDemoSteps {

    private WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;

    public SauceDemoSteps() {
        driver = WebDriverFactory.getDriver();
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter my username and password")
    public void iEnterMyUsernameAndPassword() {
        loginPage.login("standard_user", "secret_sauce");
    }

    @Then("I am logged in")
    public void iAmLoggedIn() {
        assertTrue(driver.getCurrentUrl().contains("inventory.html"));
    }

}
