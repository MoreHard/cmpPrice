package com.cmpPrice.comparePrice.Repogitory;

import org.openqa.selenium.WebDriver;

public interface SeleniumRepository {
    public void createDriver();
    public void stopDriver();
    public WebDriver getDriver();
}
