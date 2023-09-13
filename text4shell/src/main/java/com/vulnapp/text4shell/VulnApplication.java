package com.vulnapp.text4shell;

import org.apache.commons.text.StringSubstitutor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class VulnApplication {
    public static void main(String[] args) {
      SpringApplication.run(VulnApplication.class, args);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView index() {
              ModelAndView modelAndView = new ModelAndView();
              modelAndView.setViewName("index.html");
              return modelAndView;
    }

}

