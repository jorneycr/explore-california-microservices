package com.example.exporecalijpa.repository;

import com.example.exporecalijpa.model.Difficulty;
import com.example.exporecalijpa.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TourRepository extends JpaRepository<Tour, Integer> {
    List<Tour> findByDifficulty(Difficulty  difficulty);
    List<Tour> findByTourPackageCode(String code);
}
