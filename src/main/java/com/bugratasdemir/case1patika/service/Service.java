package com.bugratasdemir.case1patika.service;

import com.bugratasdemir.case1patika.housetype.AbstractHouseType;
import java.util.List;

public class Service implements IService {
    @Override
    public double getByTotalPriceOfHouses(List<AbstractHouseType> houseList) {
        return houseList.stream()
                .mapToDouble(AbstractHouseType::getPrice)
                .sum();
    }
    @Override
    public void getFeaturesByHouseType(List<AbstractHouseType> houseTypeList) {
        houseTypeList.stream()
                .map(AbstractHouseType::homeInfo)
                .forEach(house -> System.out.println("Features of the Selected House Type = " + house));
    }
    @Override
    public double getByAverageSquareMetersOfHouses(List<AbstractHouseType> houseList) {
        return houseList.stream()
                .mapToDouble(AbstractHouseType::getSquareMeters)
                .average()
                .orElse(0.0);
    }

    @Override
    public void filterAllTypesOfHousesByNumberOfRoomsAndLivingRooms(List<AbstractHouseType> houseList, int numberOfRooms, int numberOfHalls) {
        houseList.stream()
                .filter(house -> house.getNumberOfRooms() == numberOfRooms && house.getNumberOfHalls() == numberOfHalls)
                .map(AbstractHouseType::homeInfo)
                .forEach(house -> System.out.println("Features of the Selected House Type = " + house));
    }
}