package com.example.exporecalijpa.business;

import com.example.exporecalijpa.model.Difficulty;
import com.example.exporecalijpa.model.Region;
import com.example.exporecalijpa.model.Tour;
import com.example.exporecalijpa.model.TourPackage;
import com.example.exporecalijpa.repository.TourPackageRepository;
import com.example.exporecalijpa.repository.TourRepository;
import org.springframework.stereotype.Service;

@Service
public class TourService {
    private TourPackageRepository tourPackageRepository;
    private TourRepository tourRepository;

    public TourService(TourPackageRepository tourPackageRepository, TourRepository tourRepository) {
        this.tourPackageRepository = tourPackageRepository;
        this.tourRepository = tourRepository;
    }

    public Tour createTour(String tourPackageName, String title,
                           String description, String blurb, Integer price, String duration,
                           String bullets, String keywords, Difficulty difficulty, Region region) {

        TourPackage tourPackage = null;
        return new Tour(title, description, blurb,
                price, duration, bullets, keywords, tourPackage, difficulty, region);
    }

    public long total() {
        return 0;
    }
}