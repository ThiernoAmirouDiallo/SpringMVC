package simpleApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

//    @GetMapping("/home")
    public String showHome() {
        // do something
        return "index";
    }

    @GetMapping("/index")
    public String showIndex() {
        // do something
        return showHome();
    }

    @GetMapping("/")
    public String showRoot() {
        // do something
        System.out.println("root");
        return showHome();
    }
}
