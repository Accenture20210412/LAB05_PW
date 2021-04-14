package src.decorator;

import java.util.List;

public class CarWithLeather extends CarDecorator{

    public CarWithLeather(Car car) {
        super(car);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 500.5;
    }

    @Override
    public List<Features> getFeatures() {
        List<Features> newFeaturesList = super.getFeatures();
        newFeaturesList.add(Features.LETHERSEATS);
        return newFeaturesList;
    }


}
