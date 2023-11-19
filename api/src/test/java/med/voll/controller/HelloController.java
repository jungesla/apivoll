package med.voll.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    @RequestMapping("/hello")
    public String olaMundos(){
        return "Larissaggghghghj";
    }



}
