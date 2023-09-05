package com.bboygg.e2e_automation_selenium_java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// BasePage class acts as a parent for all the page classes
// It contains all the common methods and variables needed by the page classes
public class BasePage {
    public WebDriver driver; // WebDriver instance to interact with the web browser
    public WebDriverWait wait; // WebDriverWait instance to allow explicit waits

    // constructor for the BasePage Class
    // Initializes the WebDriver, WebDriverWait and web elements of the page class
    public BasePage(WebDriver webDriver) {
        this.driver = webDriver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(60), Duration.ofSeconds(1));
        PageFactory.initElements(driver, this); // Initialize the web elements
    }

    // Wait until the specified element is visible
    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Click on the specified element
    public void click(WebElement element) {
        waitForVisibility(element);
        element.click();
    }

    // clear and enter text into specified input element
    public void enterText(WebElement element, String text) {
        clear(element);
        element.sendKeys(text);
    }

    // Clear the specified input element
    public void clear(WebElement element) {
        waitForVisibility(element);
        element.clear();
    }

}
