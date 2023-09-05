package com.bboygg.e2e_automation_selenium_java.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Utils {
    public static void takeScreenshot(WebDriver driver, String screenshotName ) {
        try {
            // Pause capture for a few seconds
            TimeUnit.SECONDS.sleep(1);
            // Take a screenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Define the screenshot directory
            String dirPath = System.getProperty("user.dir") + "/Screenshots/";
            File screenshotDirectory = new File(dirPath);

            // Create the screenshot directory if it does not exist
            if (!screenshotDirectory.exists()) {
                screenshotDirectory.mkdirs();
            }

            // Generate the date for the screenshot name to make it unique file
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

            String destination = dirPath + timestamp + "_" + screenshotName + ".png";

            Files.copy(source.toPath(), Paths.get(destination));
            System.out.println("Screenshot saved to: " + destination);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
