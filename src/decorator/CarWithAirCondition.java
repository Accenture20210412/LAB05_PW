package src.decorator;

import java.util.ArrayList;
import java.util.List;

public class CarWithAirCondition extends CarDecorator{

    public CarWithAirCondition(Car car) {
        super(car);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public List<Features> getFeatures() {
        List<Features> newFeaturesList = super.getFeatures();
        newFeaturesList.add(Features.AIRCONDITION);
        return newFeaturesList;
    }
}
