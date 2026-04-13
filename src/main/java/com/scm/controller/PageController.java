package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scm.forms.UserForm;

@Controller

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
     public String aboutPage(Model model) {
      model.addAttribute("isActive",false);
        System.out.println("about page loading");
        return "about";
     }


       //about service
     @GetMapping("/service")
     public String servicesPage() {
        System.out.println("service page loading");
        return "service";
     }

     
       //about Contact
     @GetMapping("/contact")
     public String contactPage() {
        System.out.println("Contact page loading");
        return "contact";
     }
    
           //about Contact
     @GetMapping("/login")
     public String LoginPage() {
        System.out.println("Login page loading");
        return "login";
     }

           //about signUp
    @GetMapping("/signUp")
     public String signUpPage(Model model) {
         
      UserForm userform = new UserForm();
      model.addAttribute("user",userform);
      
        return "signUp";
     }


     //processing  registartion
 @RequestMapping(value = "/do-register", method = RequestMethod.POST)
public String processRegister() {
    System.out.println("POST HIT");
    return "redirect:/signUp";
}



}
