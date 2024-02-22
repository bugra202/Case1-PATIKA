package com.bugratasdemir.case1patika.service;

import com.bugratasdemir.case1patika.housetype.AbstractHouseType;
import com.bugratasdemir.case1patika.housetype.HouseRepository;

import java.util.List;

public class HouseServiceImpl implements HouseService {
    private final HouseRepository houseRepository;
    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public double getByTotalPriceOfHouses() {
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
    private double getByTotalPriceOfHouses(List<AbstractHouseType> houseList) {
        return houseList.stream()
                .mapToDouble(AbstractHouseType::getPrice)
                .sum();
    }

    private void getFeaturesByHouseType(List<AbstractHouseType> houseTypeList) {
        houseTypeList.stream()
                .map(AbstractHouseType::toString)
                .forEach(house -> System.out.println("Features of the Selected House Type = " + house));
    }

    private double getByAverageSquareMetersOfHouses(List<AbstractHouseType> houseList) {
        return houseList.stream()
                .mapToDouble(AbstractHouseType::getSquareMeters)
                .average()
                .orElse(0.0);
    }


    private void filterAllTypesOfHousesByNumberOfRoomsAndLivingRooms(List<AbstractHouseType> houseList, int numberOfRooms, int numberOfHalls) {
        houseList.stream()
                .filter(house -> house.getNumberOfRooms() == numberOfRooms && house.getNumberOfHalls() == numberOfHalls)
                .map(AbstractHouseType::toString)
                .forEach(house -> System.out.println("Features of the Selected House Type = " + house));
    }
}