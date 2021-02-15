package com.cmpPrice.comparePrice.Repogitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Repository;

@Repository
public class SeleniumRepository implements ISeleniumRepository {
    private WebDriver driver;

    public void createDriver() {
        driver = new ChromeDriver();
    }

    public void stopDriver() {
        if(driver != null) {
            driver.quit();
        }
    }
}
