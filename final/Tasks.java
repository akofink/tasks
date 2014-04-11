public class Tasks {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      (new Task(i)).work();
    }

    System.out.println("Success");
  }
}
