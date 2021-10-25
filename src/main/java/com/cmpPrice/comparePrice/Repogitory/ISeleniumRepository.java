package com.cmpPrice.comparePrice.Repogitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public interface ISeleniumRepository {
    public WebDriver createDriver();
    public WebDriver createDriver(ChromeOptions options);
    public void stopDriver();
}
