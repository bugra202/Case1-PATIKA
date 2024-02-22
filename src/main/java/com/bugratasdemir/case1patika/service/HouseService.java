package com.bugratasdemir.case1patika.service;

public interface HouseService {
    double getByTotalPriceOfHomes();
    double getByTotalPriceOfVillas();
    double getByTotalPriceOfSummerHouses();
    double getByTotalPriceOfAllTypesOfHouses();
    double getByAverageSquareMetersOfHomes();
    double getByAverageSquareMetersOfVillas();
    double getByAverageSquareMetersOfSummerHouses();
    double getByAverageSquareMetersOfAllTypesOfHouses();
    void filterAndRetrieveAllTypesOfHousesAccordingToTheNumberOfRoomsAndLivingRooms();


}
