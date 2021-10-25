package com.cmpPrice.comparePrice.Controller;

import com.cmpPrice.comparePrice.Repogitory.ISeleniumRepository;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
    @Autowired
    ISeleniumRepository seleniumRepo;

    public void test() {
        ChromeOptions options = new ChromeOptions();
        seleniumRepo.createDriver(options);
    }
}
