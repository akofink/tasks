package finished;

public class Road {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      (new Car(i)).work();
    }

    System.out.println("Success");
  }
}
