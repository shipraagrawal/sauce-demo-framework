package com.sauce.demo.framework.pageObjects;

import com.sauce.demo.framework.webDriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage {
    private WebDriver driver;

    @FindBy(css = ".inventory_item_price")
    private List<WebElement> productPrices;




    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
