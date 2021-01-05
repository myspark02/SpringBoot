package yju.scpark.security;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        System.out.println("Home Controller, / requested...");
        // return "home";
        return "/pages/home.html";
    }
}
