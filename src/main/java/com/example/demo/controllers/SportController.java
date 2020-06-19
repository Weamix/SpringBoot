package com.example.demo.controllers;

import com.example.demo.entities.Sport;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SportController {

    @RequestMapping(value = "/sports/{sportId}", method = RequestMethod.GET)
    @ResponseBody
    Sport getSportById(@PathVariable final Integer sportId) {
      final Sport sport = new Sport();
     
      sport.setId(sportId);
      sport.setName("Skiing");
      sport.setDescription("On your skis, these longs and narrows kinds of skates, you can practice several disciplines that will transport you, for fun or during competitions, in the heart of the most beautiful winter landscapes. You’ll be able to ride down the hills at a fast pace and execute controlled turns, allowing you to take fresh air and strengthen your cardiovascular system. Have a fun ride!");      
      return sport;
    }
}