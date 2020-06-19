package com.example.demo.services;

import com.example.demo.entities.Sport;
import java.util.List;

public interface SportService {
  Sport getSportById(Integer sportId);
  void addSport(Sport sport);
  List<Sport> getAllSports();
}