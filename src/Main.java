package src;

import src.decorator.BaseCar;
import src.decorator.Car;
import src.decorator.CarWithAirConAndLeatherSeats;
import src.decorator.CarWithAirCondition;

public class Main {

    public static void main(String[] args) {

        Car baseCar = new BaseCar();
        System.out.println(baseCar.getFeatures());

        System.out.println(baseCar.toString());

        var carWithAirCondition = new CarWithAirCondition(baseCar);

        System.out.println(carWithAirCondition.getPrice());

        System.out.println(carWithAirCondition.getFeatures());

        

    }
}
