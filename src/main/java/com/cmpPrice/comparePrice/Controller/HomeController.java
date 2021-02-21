package com.cmpPrice.comparePrice.Controller;

import com.cmpPrice.comparePrice.Service.HomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController{

    @Autowired
    HomeServiceImpl homeService;

    @GetMapping("/intro")
    public String home() {
        homeService.test();
        return "helloWorld";
    }
}
