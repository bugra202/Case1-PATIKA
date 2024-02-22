package com.bugratasdemir.case1patika.housetype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseRepository {
    List<Home> homeList = new ArrayList<>();
    List<Villa> villaList = new ArrayList<>();
    List<Summery> summeryList = new ArrayList<>();
    List<AbstractHouseType> allHouseList = new ArrayList<>();

    public HouseRepository() {
        homeList.add(new Home(200000,100,3,1));
        homeList.add(new Home(300000,200,4,2));
        homeList.add(new Home(400000,300,5,3));
        villaList.add(new Villa(500000,400,5,3));
        villaList.add(new Villa(600000,500,6,4));
        villaList.add(new Villa(700000,600,7,5));
        summeryList.add(new Summery(550000,450,4,3));
        summeryList.add(new Summery(650000,550,3,5));
        summeryList.add(new Summery(750000,650,2,1));
        allHouseList.addAll(homeList);
        allHouseList.addAll(villaList);
        allHouseList.addAll(summeryList);
    }

    public List<AbstractHouseType> getHomeList() {
        return homeList.stream()
                .collect(Collectors.toList());
    }
    public List<AbstractHouseType> getVillaList() {
        return villaList.stream()
                .collect(Collectors.toList());
    }
    public List<AbstractHouseType> getSummeryList() {
        return summeryList.stream()
                .collect(Collectors.toList());
    }
    public List<AbstractHouseType> getHouseList() {
        return allHouseList.stream()
                .collect(Collectors.toList());
    }
}