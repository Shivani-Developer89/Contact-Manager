package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/scm")
public class PageController {

    @GetMapping("/home")
    public String home(Model model) {
        System.out.println("Home Page Handler");

        //sending data to view
        model.addAttribute("name","Springboot Application");
        model.addAttribute("YoutubeChannel","SpringIO");
        model.addAttribute("GithubRepo","https://github.com/Shivani-Developer89");
        return "home";
    }


     //about route
     @GetMapping("/about")
     public String aboutPage() {
        System.out.println("about page loading");
        return "about";
     }


       //about service
     @GetMapping("/services")
     public String servicesPage() {
        System.out.println("service page loading");
        return "services";
     }



}
