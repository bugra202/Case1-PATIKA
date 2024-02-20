package com.bugratasdemir.case1patika.service;

import com.bugratasdemir.case1patika.housetype.AbstractHouseType;
import java.util.List;

public interface IService {
    void getFeaturesByHouseType(List<AbstractHouseType> abstractEvTipleriList);
    double getByTotalPriceOfHouses(List<AbstractHouseType> houseList);
    double getByAverageSquareMetersOfHouses(List<AbstractHouseType> houseList);
    void filterAllTypesOfHousesByNumberOfRoomsAndLivingRooms(List<AbstractHouseType> houseList, int numberOfRooms, int numberOfHalls);

}
