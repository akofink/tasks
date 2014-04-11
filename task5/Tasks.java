import java.util.List;
import java.util.ArrayList;

public class Tasks {
  public static void main(String[] args) {
    //TODO
    List<Task> tasks = new ArrayList<Task>();

    for (int i = 1; i <= 5; i++) {
      tasks.add(new Task(i));
    }

    for(Task task : tasks) {
      task.work();
    }

    System.out.println("Success");
  }
}
