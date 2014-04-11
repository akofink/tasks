import java.util.List;
import java.util.ArrayList;

public class Tasks {
  public static void main(String[] args) {
    List<Task> tasks = new ArrayList<Task>();

    //TODO
    tasks.add(new Task1());
    tasks.add(new Task2());
    tasks.add(new Task3());
    tasks.add(new Task4());
    tasks.add(new Task5());

    for(Task task : tasks) {
      task.work();
    }

    System.out.println("Success");
  }
}
