package com.cmpPrice.comparePrice.Repogitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Repository;

@Repository
public class SeleniumRepository implements ISeleniumRepository {
    private WebDriver driver;

    public WebDriver createDriver() {
        driver = new ChromeDriver();
        return driver;
    }

    @Override
    public WebDriver createDriver(ChromeOptions options) {
        driver = new ChromeDriver(options);
        return driver;
    }

    public void stopDriver() {
        if(driver != null) {
            driver.quit();
        }
    }
}
