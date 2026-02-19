package com.example.exporecalijpa.business;

import com.example.exporecalijpa.model.TourPackage;
import com.example.exporecalijpa.repository.TourPackageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    public TourPackage createTourPackage(String code, String name) {
        return new TourPackage(code, name);
    }

    public List<TourPackage> lookupAll() {
        return null;
    }

    public long total() {
        return 0;
    }
}
