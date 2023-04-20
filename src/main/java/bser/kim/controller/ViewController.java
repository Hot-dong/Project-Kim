package bser.kim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/")
    public String index(String message, Model model){
        System.out.println(message);
        model.addAttribute("message", message);
        return "index";
    }
}
