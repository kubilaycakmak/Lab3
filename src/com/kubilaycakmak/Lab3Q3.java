package com.kubilaycakmak;
import java.util.ArrayList;
import java.util.Comparator;

public class Lab3Q3 {
    public static void main(String[] args) {

        ArrayList<Car> arrayList = new ArrayList<>(3);
        Car mercedes = new Car("Mercedes", "E350", 2012);
        Car ford = new Car("Ford", "Mustang", 1967);
        Car dodge = new Car("Dodge", "Challenger", 2018);

        arrayList.add(mercedes);
        arrayList.add(ford);
        arrayList.add(dodge);

        arrayList.sort(Comparator.comparing(e -> e.year));
        System.out.println(arrayList);
    }
}
