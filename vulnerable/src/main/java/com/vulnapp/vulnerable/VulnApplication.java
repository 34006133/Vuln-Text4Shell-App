package com.vulnapp.vulnerable;

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
import org.springframework.ui.Model;

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

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    @ResponseBody
    public String record(@RequestParam(defaultValue = "") String input) {
            
            final StringSubstitutor interpolator = StringSubstitutor.createInterpolator();
            
            try {
                String output = interpolator.replace(input);
                return "Result:\n" + output;    
            }
            
            catch(Exception e) {
                System.out.println(e);
            }

            return null;
    }
}

