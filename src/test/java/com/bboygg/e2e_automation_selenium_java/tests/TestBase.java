package com.bboygg.e2e_automation_selenium_java.tests;

import com.bboygg.e2e_automation_selenium_java.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.out.println("Initialize the driver..");

        try {
            driver = new ChromeDriver(); // get chrome driver
            driver.manage().window().maximize(); //maximize the browser
            System.out.println("Driver initialized successfully!");
        } catch (Exception e) {
            System.out.println("Error during driver initialization");
            e.printStackTrace(); // If initialization fail it will throw exception
        }
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Start Running Test Method...");
    }

    @AfterMethod
    public void afterMethodCaptureScreenShot(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println(":( " +result.getName() + "Test"+ " failed.");
            Utils.takeScreenshot(driver,result.getName() + "FAILED");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            System.out.println(":) " + result.getName() + "Test" + " passed.");
            Utils.takeScreenshot(driver, result.getName() + "PASSED");
        }
    }
    @AfterTest
    public void tearDown() {
        System.out.println("Tearing down driver...");
        if (driver != null) {
            driver.quit();
        }

    }
}
