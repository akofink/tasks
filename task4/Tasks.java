import java.util.List;
import java.util.ArrayList;

public class Tasks {
  public static void main(String[] args) {
    List<Task> tasks = new ArrayList<Task>();

    //TODO
    tasks.add(new Task(1));
    tasks.add(new Task(2));
    tasks.add(new Task(3));
    tasks.add(new Task(4));
    tasks.add(new Task(5));

    for(Task task : tasks) {
      task.work();
    }

    System.out.println("Success");
  }
}
