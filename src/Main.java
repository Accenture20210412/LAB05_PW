package src;

import src.decorator.*;

public class Main {

    public static void main(String[] args) {

        Car baseCar = new BaseCar();
        System.out.println(baseCar.toString());

        var carWithAirConAndLeatherSeats = new CarWithAirCondition(new CarWithLeather(baseCar));
        System.out.println(carWithAirConAndLeatherSeats.toString());

        var carWithLeatherSeatsAndAirCon = new CarWithLeather(new CarWithAirCondition(baseCar));
        System.out.println(carWithLeatherSeatsAndAirCon.toString());


    }
}
