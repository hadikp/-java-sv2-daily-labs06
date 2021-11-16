package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {
    private List<Double> doubleNumber = new ArrayList<>();

    public void numberAdd (double number) {
        doubleNumber.add(number);
    }

    public List<Double> getDoubleNumber() {
        return doubleNumber;
    }
}
