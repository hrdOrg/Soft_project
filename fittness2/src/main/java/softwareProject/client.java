package softwareProject;

import java.util.ArrayList;

public class client {

	private Integer age;
	private String name;
	private String gender;
	private ArrayList<String> fittnessGoals = new ArrayList<String>();
	private ArrayList<String> dietary = new ArrayList<String>();
	private ArrayList<String> restrictions = new ArrayList<String>();
	
	private ArrayList<program> clientP = new ArrayList<program>();
	
	private ArrayList<program> programs = new ArrayList<program>();
	
	private ArrayList<String> achievements = new ArrayList<String>();
	
	private double weight;
	private double BMI;
	private double height;
	//private String attendance;
	
	public client() {
		
	}
	
	public client(int a, String n, String g,double w, double h) {
		this.age=a;
		this.gender=g;
		this.name=n;
		this.height=h;
		this.weight=w;
		
	}
	
	public void setGender(String g) {
		this.gender=g;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setName(String a) {
		this.name=a;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addAchievements(String A) {
		if(!this.achievements.contains(A)) {
			this.achievements.add(A);
			System.out.println("the achievement is added");
		}
		else System.out.println("you have this achievement already");
	}
	
	public ArrayList<String> getAchievements(){
		if (this.achievements.isEmpty()) {
			System.out.println("there is no achievements");
			return null;
		}
		else return this.achievements;
	}
	
	public void delAchievements(String A) {
		if(this.achievements.contains(A)) {
			this.achievements.remove(A);
			System.out.println("the achievement is deleted");
		}
		else System.out.println("the achievement is not on your list in the first place");
		
	}
	
	public void setWeight(double w) {
		this.weight=w;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setHight(double h) {
		if (h>100 && h<300) {
			h/=100;
			this.height=h;
			System.out.println("the program has automatically converts the hight from centimeters to metes");
		}
		if(h<3 && h>1) {
			this.height=h;
		}
		else System.out.println("the hight is invalid");
	} 

	public double getHeight() {
		return this.height;
	}
	
	public void calBMI(){
		this.BMI=this.weight/(this.height*this.height);//the height in meters
	}
	
	public double getBMI() {
		return this.BMI;
	}
	
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
	
	public ArrayList<String> getFittnessGoals(){
		if (this.fittnessGoals.isEmpty()) {
			System.out.println("there is no Fittness Goals");
			return null;
		}
		else return this.fittnessGoals;
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
	
	public ArrayList<String> getDietary(){
		if (this.dietary.isEmpty()) {
			System.out.println("there is no dietary");
			return null;
		}
		else return this.dietary;
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
	
	public ArrayList<String> getRestrictions(){
		if (this.restrictions.isEmpty()) {
			System.out.println("there is no Restrictions");
			return null;
		}
		else return this.restrictions;
	}
	
	/*
	public void submitImprovment (String Sub) {
		
		
	}
	
	public void submitRate (int r) {
		
	}
	
	public void submitReview(String rev) {
		
	}*/
	
	public ArrayList<program> filterD(String n ) {

		//"Beginner""Intermediate""Advanced"
		ArrayList<program> P=new ArrayList<program>();
		String p;
		
		for (int i=0; i<programs.size();i++) {
			p=P.get(i).get_level();
			if (p==n) {
				P.add(programs.get(i));
			}
		}
		if (P.isEmpty())
			System.out.println("there is no program with this requirement");
		
		return P;
	}
	
	public ArrayList<program> filterF(String n) {
		//"weight loss "muscle building" "flexibility"
		ArrayList<program> P=new ArrayList<program>();
		String p;
		
		for (int i=0; i<programs.size();i++) {
			
			p=P.get(i).get_goals();
			if (p==n) {
				P.add(programs.get(i));
			}
		}
		if (P.isEmpty())
			System.out.println("there is no program with this requirement");
		return P;
		
	}
	
	public ArrayList<program> filters(String F,String D) {
		//هاد الفنكشن ممكن اعملو بطريقة تانية بحيت انادي ع اللاتر الي فوق و اشوف شو هن البرامج المشتركة و ارجعهم 
		ArrayList<program> P=new ArrayList<program>();
		String f;
		String d;
		for (int i=0; i<programs.size();i++) {
			f=P.get(i).get_goals();
			d=P.get(i).get_level();
			if (f==F) {
				if(d==D)
				P.add(programs.get(i));
			}
		}
		/*"weight loss "muscle building" "flexibility"*/
		if (P.isEmpty())
			System.out.println("there is no program with this requirements");
		return P;
		
	}
	
	public void schedulesView() {
		
		System.out.println("all the programs yoru enrolled in");
		 System.out.println();
			 for (int i=0;i<programs.size();i++) {
				 System.out.println(programs.get(i).get_titel());
				 System.out.println();
			 }
			
	}
	
	public ArrayList<program> getprograms(){
		return clientP;
	}
	
	public void enroll(program p) {
		if(!this.clientP.contains(p)) {
			this.clientP.add(p);
			System.out.println("the program is added");
		}
		else System.out.println("you have this achievement already");
			
	}
	
	public void delProgram(program P) {
		if(clientP.contains(P)) {
			clientP.remove(P);
			System.out.println("the program is deleted");
		}
		else System.out.println("the program is not enrolled in the first place");

	}
	
	
	
}
