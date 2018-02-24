import java.util.ArrayList;

public class main{

  private static ArrayList<Prompt> prompts = new ArrayList<>();
  private int Stress;
  private int Energy;
  private int Friends;
  private int Grades;

  public static void main(String args[]){
	  prompts.add(new Prompt("You did your homework until 1 am. When do you wake up?", "yes", "no", -5, 10, -15, 5, 0, -5, 10, -10));
	
	  System.out.println(prompts.get(0));


  }
}
