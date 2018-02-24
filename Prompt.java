class Prompt {
	
	private String prompt;
	private String[2] options;
	private int[2] stress;
	private int[2] energy;
	private int[2] friends;
	private int[2] grades;

	public Prompt(String prompt, String option1, String option2, int stress1, int stress2, int energy1, int energy2, int friends1, int friends2, int grades1, int grades2) {
		this.prompt = prompt;
		this.options[0] = option1;
		this.optiopns[1] = option2;
		this.stress[0] = stress1;
		this.stress[1] = stress1;
		this.energy[0] = energy1;
		this.energy[1] = energy2;
		this.friends[0] = friends1;
		this.friends[1] = friends2;
		this.grades[0] = grades1;
		this.grades[1] = grades2;
	}
	
	public String toString() {
		return this.prompt;
	}
}