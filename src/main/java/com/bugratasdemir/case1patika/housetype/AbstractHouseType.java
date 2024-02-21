package com.bugratasdemir.case1patika.housetype;

public abstract class AbstractHouseType {
    private String type;
    private int price;
    private int squareMeters;
    private int numberOfRooms;
    private int numberOfHalls;

    public AbstractHouseType(String type, int price, int squareMeters, int numberOfRooms, int numberOfHalls) {
        this.type = type;
        this.price = price;
        this.squareMeters = squareMeters;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }
    @Override
    public String toString() {
        return "AbstractHouseType{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", squareMeters=" + squareMeters +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfHalls=" + numberOfHalls +
                '}';
    }
}