import java.util.List;
import java.util.ArrayList;

public class Cars {
  public static void main(String[] args) {
    //TODO
    List<Car> cars = new ArrayList<Car>();

    for (int i = 1; i <= 5; i++) {
      cars.add(new Car(i));
    }

    for(Car car : cars) {
      car.work();
    }

    System.out.println("Success");
  }
}
