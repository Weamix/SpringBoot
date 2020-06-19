package com.example.demo.services;

import com.example.demo.entities.Sport;
import com.example.demo.repositories.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportServiceImpl implements SportService {

    private SportRepository sportRepository;

    @Autowired
    public SportServiceImpl(final SportRepository sportRepository){
        this.sportRepository = sportRepository;
    }

    @Override
    public Sport getSportById(Integer sportId) {
        return this.sportRepository.getSportById(sportId);
    }

    @Override
    public void addSport(Sport sport) {
        this.sportRepository.addSport(sport);
    }

    @Override
    public List<Sport> getAllSports() {
        return this.sportRepository.getAllSports();
    }
}
