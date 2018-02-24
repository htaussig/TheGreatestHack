package mahacks;


public class Prompt {
	
	private String prompt;
	private int[] stress = new int[2];
	private int[] energy = new int[2];
	private int[] friends = new int[2];
	private int[] grades = new int[2];
	private String[] options = new String[2];
	private double orderNum;

	public Prompt(String prompt, String option1, String option2, int stress1, int stress2, int energy1, int energy2, int friends1, int friends2, int grades1, int grades2) {
		this.prompt = prompt;
		this.options[0] = option1;
		this.options[1] = option2;
		this.stress[0] = stress1;
		this.stress[1] = stress2;
		this.energy[0] = energy1;
		this.energy[1] = energy2;
		this.friends[0] = friends1;
		this.friends[1] = friends2;
		this.grades[0] = grades1;
		this.grades[1] = grades2;
		this.orderNum = Math.random();
	}
	
	public int[] getStressChange(){
		return stress;
	}
	
	public int[] getEnergyChange(){
		return energy;
	}
	
	public int[] getFriendsChange(){
		return friends;
	}
	
	public int[] getGradesChange(){
		return grades;
	}
	
	public String toString() {
		return this.prompt;
	}
}