package bser.kim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/")
    public String test(){
        return "test";
    }

    @PostMapping("/")
    public String index(String message, Model model){
        System.out.println(message);
        model.addAttribute("message", message);
        return "test";
    }
}
