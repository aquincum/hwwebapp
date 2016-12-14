package hu.szeredi.daniel.hwwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Trial {
    @RequestMapping("/zumm")
    @ResponseBody
    String home(){
        return "I'm in your applicatioun";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Trial.class, args);
    }

}
