package net.damagewiz.damagewizweb.service.impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.damagewiz.damagewizweb.entity.Car;
import net.damagewiz.damagewizweb.entity.CarPart;
import net.damagewiz.damagewizweb.entity.Mechanic;
import net.damagewiz.damagewizweb.repository.CarPartRepository;
import net.damagewiz.damagewizweb.repository.MechanicRepository;
import net.damagewiz.damagewizweb.service.CarPartService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarPartServiceImpl implements CarPartService {

    private final CarPartRepository carPartRepository;
    private final MechanicRepository mechanicRepository;

    @Override
    public List<CarPart> getAllCarParts() {
        List<CarPart> carPartList = carPartRepository.findAll();
        System.out.println(carPartList);
        return carPartList;
    }

    @Override
    public List<CarPart> getCarPartsByMechanicId(Long id) {
        List<CarPart> carPartList = carPartRepository.findAll();
        List<CarPart> carPartsByMechanicId = new ArrayList<>();

        for(CarPart carPart: carPartList){
            if(carPart.getMechanic().getId() == id){
                carPartsByMechanicId.add(carPart);
            }
        }
        return carPartsByMechanicId;
    }

    @Override
    public List<CarPart> getCarPartsFromPythonAPI(Long carId, Long partId) {

        return null;
    }
}
