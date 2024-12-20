package softwareProject;

import java.util.ArrayList;

public class client {

	private Integer age;
	private ArrayList<String> fittnessGoals = new ArrayList<String>();
	private ArrayList<String> dietary = new ArrayList<String>();
	private ArrayList<String> restrictions = new ArrayList<String>();
	
	public void setAge(int a) {
		this.age=a;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void addFittnessGoals(String fit) {
		if(!this.fittnessGoals.contains(fit)) {
			this.fittnessGoals.add(fit);
			System.out.println("the goal is added");
		}
		else System.out.println("you have this goal already");
	}
	
	public void deleteFittnessGoals(String fit) {
		if(this.fittnessGoals.contains(fit)) {
			this.fittnessGoals.remove(fit);
			System.out.println("the goal is deleted");
		}
		else System.out.println("the goal is not on your list in the first place");
	}
	
	public void addDietary(String diet) {
		if(!this.dietary.contains(diet)) {
			this.dietary.add(diet);
			System.out.println("this dietary reference is added");
		}
		else System.out.println("you have this dietary reference already");
	}
	
	public void deleteDietary (String diet) {
		if(this.dietary.contains(diet)) {
			this.dietary.remove(diet);
			System.out.println("this dietary reference is deleted");
		}
		else System.out.println("the dietary reference is not on your list in the first place");
	}
	
	public void addRestrictions(String res) {
		if(!this.restrictions.contains(res)) {
			this.restrictions.add(res);
			System.out.println("the restriction is added");
		}
		else System.out.println("you have this restriction already");
	}
	
	public void deleteRestrictions(String res) {
		if(this.restrictions.contains(res)) {
			this.restrictions.remove(res);
			System.out.println("the restriction is deleted");
		}
		else System.out.println("the restriction is not on your list in the first place");
	}
	
	public void submitImprovment (String Sub) {
		
		
	}
	





















	
}
