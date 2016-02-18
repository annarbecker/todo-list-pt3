import java.util.ArrayList;

public class Category {

  private static ArrayList<Category> instances = new ArrayList<Category>();
  private String mName;
  private ArrayList<Task> mTasks;

  public Category(String name) {
    mName = name;
    mTasks = new ArrayList<Task>();
  }
  public String getName() {
    return mName;
  }
  public ArrayList<Task> getTasks() {
    return mTasks;
  }
}
