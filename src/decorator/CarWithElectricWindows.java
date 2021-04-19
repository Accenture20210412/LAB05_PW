package src.decorator;

import java.util.EnumSet;
import java.util.List;

public class CarWithElectricWindows extends CarDecorator{

    public CarWithElectricWindows(Car car) {
        super(car);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 200.8;
    }

    @Override
    public List<Features> getFeatures() {
        List<Features> newFeaturesList = super.getFeatures();
        newFeaturesList.add(Features.ELECTRICWINDOWS);
        return newFeaturesList;
    }
}
