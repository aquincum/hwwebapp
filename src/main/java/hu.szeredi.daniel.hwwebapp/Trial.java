package hu.szeredi.daniel.hwwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class Trial {
    @RequestMapping("/zumm")
    @ResponseBody
    String home(){
        return "I'm in your applicatioun";
    }

    @RequestMapping("/")
    @ResponseBody
    String asdhome(){
        return "Isadasdasdas'm in your applicatioun";
    }



    public static void main(String[] args) throws Exception {
        SpringApplication.run(Trial.class, args);
    }

}
