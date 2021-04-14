package src.decorator;

import java.util.ArrayList;
import java.util.List;

public class BaseCar implements Car{

    List<Features> features = new ArrayList<>();

    @Override
    public double getPrice() {
        return 30000;
    }

    @Override
    public List<Features> getFeatures() {
        return features;
    }

    @Override
    public String toString() {
        return "BaseCar{" +
                "features=" + features +
                ", price= " + getPrice() + '}';
    }
}
