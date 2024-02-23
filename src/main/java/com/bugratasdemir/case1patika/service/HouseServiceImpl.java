package com.bugratasdemir.case1patika.service;

import com.bugratasdemir.case1patika.housetype.AbstractHouseType;
import com.bugratasdemir.case1patika.housetype.HouseRepository;
import java.util.List;
import java.util.stream.Collectors;

public class HouseServiceImpl implements HouseService {
    private final HouseRepository houseRepository;
    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public double getByTotalPriceOfHomes() {
       return getByTotalPriceOfHouses(houseRepository.getHomeList());
    }
    @Override
    public double getByTotalPriceOfVillas() {
        return getByTotalPriceOfHouses(houseRepository.getVillaList());
    }
    @Override
    public double getByTotalPriceOfSummerHouses() {
        return getByTotalPriceOfHouses(houseRepository.getSummeryList());
    }
    @Override
    public double getByTotalPriceOfAllTypesOfHouses() {
        return getByTotalPriceOfHouses(houseRepository.getHouseList());
    }
    @Override
    public double getByAverageSquareMetersOfHomes() {
        return getByAverageSquareMetersOfHouses(houseRepository.getHomeList());
    }
    @Override
    public double getByAverageSquareMetersOfVillas() {
        return getByAverageSquareMetersOfHouses(houseRepository.getVillaList());
    }
    @Override
    public double getByAverageSquareMetersOfSummerHouses() {
        return getByAverageSquareMetersOfHouses(houseRepository.getSummeryList());
    }
    @Override
    public double getByAverageSquareMetersOfAllTypesOfHouses() {
        return getByAverageSquareMetersOfHouses(houseRepository.getHouseList());
    }
    @Override
    public void filterAndRetrieveAllTypesOfHousesAccordingToTheNumberOfRoomsAndLivingRooms() {
        List<AbstractHouseType> selectedHouses = filterAllTypesOfHousesByNumberOfRoomsAndLivingRooms(
                houseRepository.getHouseList(), 5, 3);

        if (selectedHouses.isEmpty()) {
            System.out.println("No matching house type found.");
        } else {
            selectedHouses.forEach(house -> System.out.println("Features of the Selected House Type = " + house));
        }
    }
    private double getByTotalPriceOfHouses(List<AbstractHouseType> houseList) {
        return houseList.stream()
                .mapToDouble(AbstractHouseType::getPrice)
                .sum();
    }
    private double getByAverageSquareMetersOfHouses(List<AbstractHouseType> houseList) {
        return houseList.stream()
                .mapToDouble(AbstractHouseType::getSquareMeters)
                .average()
                .orElse(0.0);
    }
    private List<AbstractHouseType> filterAllTypesOfHousesByNumberOfRoomsAndLivingRooms(
            List<AbstractHouseType> houseList, int numberOfRooms, int numberOfHalls) {
        return houseList.stream()
                .filter(house -> house.getNumberOfRooms() == numberOfRooms && house.getNumberOfHalls() == numberOfHalls)
                .collect(Collectors.toList());
    }
}