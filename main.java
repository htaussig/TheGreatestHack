import java.util.ArrayList;
import java.util.Scanner;

public class main{

	private static int promptNum;
	private static ArrayList<Prompt> prompts = new ArrayList<>();
	private int stress = 50;
	private int energy = 50;
	private int friends = 50;
	private int grades = 50;
	private static boolean alive = true;
	private int time = 0;

  public static void main(String args[]){
	  
	  intializePrompts();
	  
	  while(alive){
		  displayPrompt();
		  getButtonPressed();
		  
	  }
	 
	  
	  
  }

  private static void displayPrompt() {
	
	  System.out.println(prompts.get(promptNum).toString());
	  promptNum++;
	  
  }

private static void intializePrompts() {
	  prompts.add(new Prompt("You did your homework until 1 am. When do you wake up?", "yes", "no", -5, 10, -15, 5, 0, -5, 10, -10));
		
	  System.out.println(prompts.get(0));
  }

/**
   * this method is called when a prompt option is chosen
   * @var int option: shows what option the player chose. 0 for first, 1 for second option
   */
  public void choice(int option){
	  
	  Prompt currentPrompt = prompts.get(promptNum);
	  stress += currentPrompt.getStressChange()[option];
	  energy += currentPrompt.getEnergyChange()[option];
	  friends += currentPrompt.getFriendsChange()[option];
	  grades += currentPrompt.getGradesChange()[option];
	  
  }
  
  public void getButtonPressed(){
	  
	  Scanner sc = new Scanner(System.in);
	  
	  int i = sc.nextInt();
	  
	  choice(i);
	  
  }
 
}