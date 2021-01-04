package yju.scpark.security;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller

public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }
}
