package com.bugratasdemir.case1patika;

import com.bugratasdemir.case1patika.housetype.HouseRepository;
import com.bugratasdemir.case1patika.service.HouseServiceImpl;

public class main {
    public static void main(String[] args) {
        HouseRepository houseRepository = new HouseRepository();
        HouseServiceImpl houseService = new HouseServiceImpl(houseRepository);

        System.out.println("Total Amount of Homes : " + houseService.getByTotalPriceOfHomes());
        System.out.println("-----------------------------------------------");
        System.out.println("Total Amount of Villas : " + houseService.getByTotalPriceOfVillas());
        System.out.println("-----------------------------------------------");
        System.out.println("Total Amount of Summery : " + houseService.getByTotalPriceOfSummerHouses());
        System.out.println("-----------------------------------------------");
        System.out.println("Total Amount of Houses : " + houseService.getByTotalPriceOfAllTypesOfHouses());
        System.out.println("-----------------------------------------------");
        System.out.println("Average Square Meters Of Homes : " + houseService.getByAverageSquareMetersOfHomes());
        System.out.println("-----------------------------------------------");
        System.out.println("Average Square Meters Of Villas : " + houseService.getByAverageSquareMetersOfVillas());
        System.out.println("-----------------------------------------------");
        System.out.println("Average Square Meters Of Summery : " + houseService.getByAverageSquareMetersOfSummerHouses());
        System.out.println("-----------------------------------------------");
        System.out.println("Average Square Meters Of Houses : " + houseService.getByAverageSquareMetersOfAllTypesOfHouses());
        System.out.println("-----------------------------------------------");
        System.out.println("Method That Filters And Returns All Types Of Houses According To The Number Of Rooms And Living Rooms : ");
        houseService.filterAndRetrieveAllTypesOfHousesAccordingToTheNumberOfRoomsAndLivingRooms();

    }
}
