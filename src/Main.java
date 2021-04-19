package src;

import src.decorator.*;

public class Main {

    public static void main(String[] args) {

        Car baseCar = new BaseCar();
        System.out.println(baseCar.toString());

        var carWithAirConAndElectricWinAndLeatherSeats = new CarWithAirCondition(
                new CarWithElectricWindows(
                        new CarWithLeatherSeats(baseCar)
                )
        );
        System.out.println(carWithAirConAndElectricWinAndLeatherSeats.toString());

        var carWithElWinAndLeatherSeatsAndAirCon = new CarWithElectricWindows(
                new CarWithLeatherSeats(
                        new CarWithAirCondition(
                                new BaseCar()
                        )
                )
        );
        System.out.println(carWithElWinAndLeatherSeatsAndAirCon.toString());

    }
}
