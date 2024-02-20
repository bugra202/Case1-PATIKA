package com.bugratasdemir.case1patika;

import com.bugratasdemir.case1patika.housetype.CreateHouseType;
import com.bugratasdemir.case1patika.service.Service;

public class main {
    public static void main(String[] args) {
        CreateHouseType createEvTipleri = new CreateHouseType();
        Service houseService = new Service();

        System.out.println("Total Amount of Homes : " + houseService.getByTotalPriceOfHouses(createEvTipleri.getHomeList()));
        System.out.println("-----------------------------------------------");
        System.out.println("Total Amount of Villas : " + houseService.getByTotalPriceOfHouses(createEvTipleri.getVillaList()));
        System.out.println("-----------------------------------------------");
        System.out.println("Total Amount of Summery : " + houseService.getByTotalPriceOfHouses(createEvTipleri.getSummeryList()));
        System.out.println("-----------------------------------------------");
        System.out.println("Total Amount of Houses : " + houseService.getByTotalPriceOfHouses(createEvTipleri.getAllHouseList()));
        System.out.println("-----------------------------------------------");
        System.out.println("Average Square Meters Of Houses : " + houseService.getByAverageSquareMetersOfHouses(createEvTipleri.getAllHouseList()));
        System.out.println("-----------------------------------------------");
        System.out.println("Average Square Meters Of Villas : " + houseService.getByAverageSquareMetersOfHouses(createEvTipleri.getVillaList()));
        System.out.println("-----------------------------------------------");
        System.out.println("Average Square Meters Of Summery : " + houseService.getByAverageSquareMetersOfHouses(createEvTipleri.getSummeryList()));
        System.out.println("-----------------------------------------------");
        System.out.println("Average Square Meters Of Homes : " + houseService.getByAverageSquareMetersOfHouses(createEvTipleri.getHomeList()));
        System.out.println("-----------------------------------------------");
        System.out.println("Method That Filters And Returns All Types Of Houses According To The Number Of Rooms And Living Rooms : ");
        houseService.filterAllTypesOfHousesByNumberOfRoomsAndLivingRooms(createEvTipleri.getAllHouseList(),4,2);
        System.out.println("-----------------------------------------------");
        System.out.println("Get Features By House Type : ");
        houseService.getFeaturesByHouseType(createEvTipleri.getHomeList());



    }
}
