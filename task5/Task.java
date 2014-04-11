public class Task {
  private int id;

  public Task(int id) {
    this.id = id;
  }

  public void work() {
    System.out.println("Task " + id + " working");
  }
}
