package com.example.demo.repositories;

import com.example.demo.entities.Sport;
import java.util.List;

public interface SportRepository {
  Sport getSportById(Integer sportId);
  void addSport(Sport sport);
  List<Sport> getAllSports();
}