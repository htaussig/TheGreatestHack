package SchoolIsCool;

public class Event {
    String event;
    int stress, energy, grades, friends;

    public Event(String event, int stress, int energy, int grades, int friends) {
        this.event = event;
        this.stress = stress;
        this.energy = energy;
        this.grades = grades;
        this.friends = friends;
    }
	
	public int getStressChange(){
		return stress;
	}
	
	public int getEnergyChange(){
		return energy;
	}
	
	public int getFriendsChange(){
		return friends;
	}
	
	public int getGradesChange(){
		return grades;
	}
	
	public String toString() {
		return this.event;
	}
}