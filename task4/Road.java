package task4;

import java.util.List;
import java.util.ArrayList;

public class Road {
  public static void main(String[] args) {
    List<Car> cars = new ArrayList<Car>();

    cars.add(new Car(1));
    cars.add(new Car(2));
    cars.add(new Car(3));
    cars.add(new Car(4));
    cars.add(new Car(5));

    for(Car car : cars) {
      car.work();
    }

    System.out.println("Success");
  }
}
