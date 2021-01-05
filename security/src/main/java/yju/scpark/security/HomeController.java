package yju.scpark.security;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        System.out.println("Home Controller, / requested...");
        return "home";
        // return "/pages/home.html";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/logout-success")
    public String logoutPage() {
        return "logout";
    }

}
