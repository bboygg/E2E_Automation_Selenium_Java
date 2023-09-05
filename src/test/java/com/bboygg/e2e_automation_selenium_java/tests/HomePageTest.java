package com.bboygg.e2e_automation_selenium_java.tests;

import com.bboygg.e2e_automation_selenium_java.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{

    @Test
    public void verifyOpenUrl() {
        HomePage homePage = new HomePage(driver);
        driver.get("https://www.selenium.dev/");

        // The expected URL after clicking "About Us"
        String expectedUrl = "https://www.selenium.dev/";

        // Get the current URL after redirection
        String actualUrl = driver.getCurrentUrl();

        // Assert that the current URL matches the expected URL
        Assert.assertEquals(actualUrl, expectedUrl, "The actual is not matched the expected URL");
    }

}


