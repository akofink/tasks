package task3;

import java.util.List;
import java.util.ArrayList;

public class Road {
  public static void main(String[] args) {
    List<Car> cars = new ArrayList<Car>();

    cars.add(new Car1());
    cars.add(new Car2());
    cars.add(new Car3());
    cars.add(new Car4());
    cars.add(new Car5());

    for(Car car : cars) {
      car.work();
    }

    System.out.println("Success");
  }
}
