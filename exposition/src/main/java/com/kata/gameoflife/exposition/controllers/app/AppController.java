package com.kata.gameoflife.exposition.controllers.app;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@AllArgsConstructor
public class AppController {
    
    @GetMapping()
    String checkLiveness() {
        return "up";
    }

}
