package com.vijay.controller;
import com.vijay.model.Userlist;
import com.vijay.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class WebController { //designed to handle HTTP requests like get and post requests
    @Autowired
    WebService webService;

    @GetMapping("/")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

    @PostMapping("/postdata")
    public Userlist saveUserlist(@ModelAttribute Userlist userdetails) {
        return webService.create(userdetails);

    }
}


