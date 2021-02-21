package com.cmpPrice.comparePrice.Service;

import com.cmpPrice.comparePrice.DAO.ItemDAO;
import com.cmpPrice.comparePrice.Repogitory.SeleniumRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService{
    SeleniumRepository seleniumRepo;

    @Autowired
    public SearchServiceImpl(SeleniumRepository repo) {
        seleniumRepo = repo;
    }

    public List<ItemDAO> getPage() {
        try {
            seleniumRepo.createDriver();
            WebDriver driver = seleniumRepo.getDriver();

            List<ItemDAO> itemList = new ArrayList<ItemDAO>();

            driver.get("http://browse.auction.co.kr/search?keyword=%EC%95%84%EB%94%94%EB%8B%A4%EC%8A%A4");
            List<WebElement> items = driver.findElements(By.className("section--itemcard"));

            for(WebElement item : items) {
                String title = item.findElement(By.className("text--title")).getText();
                String price = item.findElement(By.className("text--price_seller")).getText();
                String url = item.findElement(By.className("link--itemcard")).getAttribute("href");

                ItemDAO itemStatus = new ItemDAO(title, price, url);
                itemList.add(itemStatus);
            }

            return itemList;

        } catch (Exception e) {
            System.out.println("parsing error");
        } finally {
            seleniumRepo.stopDriver();
        }

        return new ArrayList<ItemDAO>();
    }

}
