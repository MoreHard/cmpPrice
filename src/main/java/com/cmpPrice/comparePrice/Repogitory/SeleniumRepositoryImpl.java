package com.cmpPrice.comparePrice.Repogitory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Repository;

@Repository
public class SeleniumRepositoryImpl implements SeleniumRepository {
    private WebDriver driver;

    public void createDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions().addArguments("headless");
        driver = new ChromeDriver(options);
    }

    public void stopDriver() {
        if(driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
