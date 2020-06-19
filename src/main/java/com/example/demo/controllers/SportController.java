package com.example.demo.controllers;

import com.example.demo.entities.Sport;
import com.example.demo.services.SportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import java.util.List;

@SpringBootApplication
@RestController
public class SportController {

    private SportService sportService;

    @Autowired
    public SportController(final SportService sportService) {
        this.sportService = sportService;
    }

    // Get sport by ID
    @RequestMapping(value = "/sports/{sportId}", method = RequestMethod.GET)
    @ResponseBody
    Sport getSportById(@PathVariable final Integer sportId) {
      /*final Sport sport = new Sport();
     
      sport.setId(sportId);
      sport.setName("Skiing");
      sport.setDescription("On your skis, these longs and narrows kinds of skates, you can practice several disciplines that will transport you, for fun or during competitions, in the heart of the most beautiful winter landscapes. You’ll be able to ride down the hills at a fast pace and execute controlled turns, allowing you to take fresh air and strengthen your cardiovascular system. Have a fun ride!");      
      return sport;*/

      return this.sportService.getSportById(sportId);
    }

    // Get all sports
    @RequestMapping(value = "/sports", method = RequestMethod.GET)
    @ResponseBody
    List<Sport> getAllSports() {
        return this.sportService.getAllSports();
    }

    // add a sport
    @RequestMapping(value = "/sports", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    void addSport(@RequestBody Sport sport){
        this.sportService.addSport(sport);
    }
}