package test1practice;

import java.util.HashMap;
import java.util.Map;

public class Car {

    private final String color;

    private Car(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    private static final Map<String, Car> cars = new HashMap<>();

    public static Car getCar(String color){

        if(!cars.containsKey(color)) {
            cars.put(color, new Car(color));
        }

        return cars.get(color);

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}
