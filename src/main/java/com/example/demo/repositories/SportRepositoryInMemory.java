package com.example.demo.repositories;
import com.example.demo.entities.Sport;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SportRepositoryInMemory implements SportRepository {
    private ArrayList<Sport> sports;

    public SportRepositoryInMemory() {
        this.sports = new ArrayList<>();
    }

    public Sport getSportById(Integer sportId) {
        for(Sport s : this.sports){
            if(s.getId() == sportId) return s;
        }

        return null;
    }

    public void addSport(Sport sport) {
        this.sports.add(sport);
    }

    public List<Sport> getAllSports() {
        return this.sports;
    }
}
