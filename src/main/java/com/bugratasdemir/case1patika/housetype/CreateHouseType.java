package com.bugratasdemir.case1patika.housetype;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateHouseType {
    public List<AbstractHouseType> getHomeList() {
        return IntStream.rangeClosed(1, 3)
                .mapToObj(i -> new Home("Home", 200000, 100, 3, 1))
                .collect(Collectors.toList());
    }
    public List<AbstractHouseType> getVillaList() {
        return IntStream.rangeClosed(1, 3)
                .mapToObj(i -> new Villa("Villa", 500000, 300, 5, 3))
                .collect(Collectors.toList());
    }
    public List<AbstractHouseType> getSummeryList() {
        return IntStream.rangeClosed(1, 3)
                .mapToObj(i -> new Summery("Summery", 400000, 250, 4, 2))
                .collect(Collectors.toList());
    }
    public List<AbstractHouseType> getAllHouseList() {
        return Stream.of(getHomeList(), getVillaList(), getSummeryList())
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

}