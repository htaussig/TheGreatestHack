package SchoolIsCool;

import java.util.ArrayList;
import java.util.Scanner;

public class main{

	private static int promptNum = 0;
	private static ArrayList<Prompt> prompts = new ArrayList<>();
	private static int stress = 50;
	private static int energy = 50;
	private static int friends = 50;
	private static int grades = 50;
	private static boolean alive = true;
	private int time = 0;

  public static void main(String args[]){
	  
	  intializePrompts();
	  printStats();
	  
	  while(alive){
		  displayPrompt();
		  int choice = getButtonPressed();
		  if (choice != 2) {
			  choice(choice);
			  promptNum++;
			  System.out.println("time passes");
			  printStats();
		  }
		  else {
			  System.out.println("You failed");
		  }
	  }
	 
	  
	  
  }

  private static void printStats() {
	  
	  System.out.println("Stress: " + stress);
	  System.out.println("Energy: " + energy);
	  System.out.println("Friends: " + friends);
	  System.out.println("Grades: " + grades);
	  
  }

private static void displayPrompt() {
	
	if(promptNum >= prompts.size()){
		promptNum = 0;
	}
	  System.out.println(prompts.get(promptNum).toString());
	  System.out.println(prompts.get(promptNum).getOption(0) + "   or   " + prompts.get(promptNum).getOption(1));	  
  }

  private static void intializePrompts() {
	  prompts.add(new Prompt("You did your homework until 1 am. When do you wake up?", "6:00 A.M.", "10:00 A.M.", -5, 10, -15, 5, 0, -5, 10, -10));
		
	  //System.out.println(prompts.get(0));
  }

/**
   * this method is called when a prompt option is chosen
   * @var int option: shows what option the player chose. 0 for first, 1 for second option
   */
  public static void choice(int option){
	  
	  Prompt currentPrompt = prompts.get(promptNum);
	  stress += currentPrompt.getStressChange()[option];
	  energy += currentPrompt.getEnergyChange()[option];
	  friends += currentPrompt.getFriendsChange()[option];
	  grades += currentPrompt.getGradesChange()[option];
	  
  }
  
  public static int getButtonPressed(){
	  
	  Scanner sc = new Scanner(System.in);
	  
	  String i = sc.next().toLowerCase();
	  if (i.equals("left")) {
		  return 0;
	  }
	  else if (i.equals("right")) {
		  return 1;
	  }
	  else {
		  return 2;
	  }
  }
 
}