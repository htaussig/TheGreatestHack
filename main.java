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
	private static int hour = 6;
	private static int minute = 0;
	private static int day = 0; // 0 = monday

  public static void main(String args[]){
	  
	  intializePrompts();
	  printStats();
	  
	  while(alive){
		  System.out.println("Time: " + hour + ": " + (minute / 10) + (minute % 10));
		  displayPrompt();
		  int choice = getButtonPressed();
		  choice(choice);
		  timeIncrease();
		  promptNum++;
	  }
	 
	  
	  
  }

  private static void timeIncrease() {
	  minute += 30;
	  if (minute >= 60) {
		  hour += minute / 60;
		  minute -= 60;
	  }
}

private static void printStats() {
	  System.out.println("Stress: " + stress);
	  System.out.println("Energy: " + energy);
	  System.out.println("Friends: " + friends);
	  System.out.println("Grades: " + grades);
	  System.out.println("Day" + getDayString(day));
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
	  prompts.add(new Prompt("You've been invited to a party! Do you go?", "YES", "NO", 5, 0, 5, -5, 20, -10, -10, 15));
	  prompts.add(new Prompt("Spring Season is starting! Do you sign up for a sport?", "YES", "NO", 10, -5, 10, -5, 10, -5, -5, 15));
	  prompts.add(new Prompt("Your crush tells you that they really like you. Do you ask them out for a date?", "YES", "NO", 15, 0, 10, -5, 5, -5, -10, 15));
	  prompts.add(new Prompt("Your neighbors are going out for the weekend. They ask you if you could babysit their son. Do you?", "YES", "NO", 5, 0, -5, 0, -5, 5, 0, 5));
	  prompts.add(new Prompt("There's a lecture in a university in your area that is open to the public. Do you go?", "YES", "NO", 0, 0, -5, 0, -5, 5, 15, -5));
	  prompts.add(new Prompt("There's a scholarship available for college. Do you try to get it?", "YES", "NO", 15, -5, -15, 5, -5, 5, -5, 5));
	  prompts.add(new Prompt("There's a job opening in your area and you fit the criteria that would be needed to fill it. Do you apply for the job?", "YES", "NO", 15, -5, -10, 10, -10, 10, -5, 15));
  }

/**
   * this method is called when a prompt option is chosen
   * @var int option: shows what option the player chose. 0 for first, 1 for second option
   */
  public static void choice(int option){
	  
	  if (option != -1) {
		  //promptNum++;
		  //System.out.println("time passes");
		  printStats();
	  }
	  else {
		  System.out.println("You failed");
		  return;
	  }
	  
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
		  return -1;
	  }
  }
 
  public boolean isWeekday(){
	  
	  if(day >= 5){ //0 == monday
		  
		  return false;
		  
	  }
	  
	  return true;
  }
  
  public static String getDayString(int day){
	  
	  switch(day){
	  
	  case 0:
		  return "Monday";
	  case 1: 
		  return "Tuesday";
	  case 2:
		  return "Wednesday";
	  case 3:
		  return "Thursday";
	  case 4:
		  return "Friday";
	  case 5:
		  return "Saturday";
	  case 6:
		  return "Sunday";
	  default: 
		  return "Invalid Day";
	  }
	  
	  
  }
}