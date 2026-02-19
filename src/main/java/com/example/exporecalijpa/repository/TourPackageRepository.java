package com.example.exporecalijpa.repository;

import com.example.exporecalijpa.model.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TourPackageRepository extends JpaRepository<TourPackage, String> {

    Optional<TourPackage> findByName(String name);
}
