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
        return String.format("%s, features=%s, price=%.2f", this.getClass().getSimpleName(), this.getFeatures(), this.getPrice());
    }
}
