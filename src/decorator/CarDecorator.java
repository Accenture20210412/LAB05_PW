package src.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class CarDecorator implements Car{

    private Car car;
    private List<Features> features = new ArrayList<>();

    public CarDecorator(Car car) {
        this.car = car;
    }

    public boolean addFeatureToList(Features feature) {
        features.add(feature);
        return true;
    }

    @Override
    public double getPrice() {
        return car.getPrice();
    }

    @Override
    public List<Features> getFeatures() {
        List<Features> newFeaturesList = new ArrayList<>();
        newFeaturesList.addAll(car.getFeatures());
        newFeaturesList.addAll(this.features);
        return newFeaturesList;
    }

    @Override
    public String toString() {
        return "CarDecorator{" +
                "car=" + car +
                ", features=" + features +
                ", price= " + '}';
    }
}
