import java.util.ArrayList;

public class main{

	private int promptNum;
	private static ArrayList<Prompt> prompts = new ArrayList<>();
	private int stress = 50;
	private int energy = 50;
	private int friends = 50;
	private int grades = 50;

  public static void main(String args[]){
	  prompts.add(new Prompt("You did your homework until 1 am. When do you wake up?", "yes", "no", -5, 10, -15, 5, 0, -5, 10, -10));
		
	  System.out.println(prompts.get(0));
  }

  /**
   * this method is called when a prompt option is chosen
   * @var int option: shows what option the player chose. 0 for first, 1 for second option
   */
  public void choice(int option){
	  
	  Prompt currentPrompt = prompts.get(promptNum);
	  
	  
  }
 
}