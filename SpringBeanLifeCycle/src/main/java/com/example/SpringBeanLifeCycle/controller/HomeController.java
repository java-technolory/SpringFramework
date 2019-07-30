package com.example.SpringBeanLifeCycle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySources({@PropertySource("classpath:myaplication.properties")})
public class HomeController {

    @Autowired
    private Environment environment;

    @Autowired
    MessageSource messageSource;

    @Value("${messages}")
    private String message;

    @RequestMapping(value = "/")
    public String home() {
        return environment.getProperty("messages");
    }

    @RequestMapping(value = "/index")
    public ResponseEntity<?> index(Model model) {
        return new ResponseEntity<String>(messageSource.getMessage("my.name", null, null), HttpStatus.OK);
//        model.addAttribute("msg", messageSource.getMessage("my.name", null, null));
//        return "index";
    }
}
