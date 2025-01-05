package softwareProject;

import java.util.ArrayList;

public class client {
	
	public String msg=null;
	private Integer age;
	private String name;
	private String gender;
	private double weight;
	private double BMI;
	private double height;
	private int attendance; 
	private String bmi;
	private ArrayList<String> fittnessGoals = new ArrayList<String>();
	private ArrayList<String> dietary = new ArrayList<String>();
	private ArrayList<String> restrictions = new ArrayList<String>();
	private ArrayList<program> clientP = new ArrayList<program>();
	private ArrayList<String> achievements = new ArrayList<String>();
	
	public client() {
		
	}
	
	public client(int a, String n, String g,double w, double h) {
		this.age=a;
		this.gender=g;
		this.name=n;
		this.setHight(h);;
		this.weight=w;
		
	}
	////////////////////////
	public void setAttendance(int a) {
		this.attendance=a;
		
	}
	
	public int getAttendance() {
		msg="this is your attendance";
		return this.attendance;
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
	//////////////////////////////////////
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
		else {
			msg="this is your Achievements";
			return this.achievements;
			}
	}
	////////////////////////////////////////////
	public void delAchievements(String A) {
		if(this.achievements.contains(A)) {
			this.achievements.remove(A);
			System.out.println("the achievement is deleted");
		}
		else System.out.println("the achievement is not on your list in the first place");
		
	}
	
	public void setWeight(double w) {
		msg="set weight";
		this.weight=w;
	}
	
	public double getWeight() {
		msg="this is your weight";
		return this.weight;
	}
	
	public void setHight(double h) {
		if (h>100 && h<300) {
			h/=100;
			this.height=h;
			System.out.println("the program has automatically converts the hight from centimeters to metes");
			msg="set hight";
		}
		if(h<3 && h>1) {
			this.height=h;
			msg="set hight";
		}
		else System.out.println("the hight is invalid");
	} 

	public double getHeight() {
		return this.height;
	}
	
	public void calBMI(){
		this.BMI=this.weight/(this.height*this.height);//the height in meters
		msg="BMI is calculated";
	}
	
	public double getBMI() {
		return this.BMI;
	}
	//////////////////////////////////////////////
	
	public String BMImeaning() {
		calBMI();
		if (this.BMI<18.5)
			this.bmi="underweight";
		else if(this.BMI<25)
			this.bmi="healthy weight";
		else if(this.BMI<30)
			this.bmi="overweight";
		else if(this.BMI<35)
			this.bmi="obese";
			else bmi="extremely obese";
		return bmi;
	}
	/////////////////////////////////////////////
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
			msg="the goal is add";
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
			msg="there is no fittness goal";
			return null;
		}
		else { 
			msg="this is fittness goal";
			return this.fittnessGoals;
			}
	}
	
	public void addDietary(String diet) {
		if(!this.dietary.contains(diet)) {
			this.dietary.add(diet);
			System.out.println("this dietary reference is added");
			msg="the dietary is add";
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
			msg="there is no dietary";
			return null;
		}
		else { 
			msg="get dietary";
			return this.dietary;
			}
	}
	
	public void addRestrictions(String res) {
		if(!this.restrictions.contains(res)) {
			this.restrictions.add(res);
			System.out.println("the restriction is added");
			msg="the restriction is add";
		}
		else System.out.println("you have this restriction already");
	}
	
	public void deleteRestrictions(String res) {
		if(this.restrictions.contains(res)) {
			this.restrictions.remove(res);
			System.out.println("the restriction is deleted");
			msg="the restriction is deleted";
		}
		else System.out.println("the restriction is not on your list in the first place");
	}
	
	public ArrayList<String> getRestrictions(){
		if (this.restrictions.isEmpty()) {
			System.out.println("there is no Restrictions");
			return null;
		}
		else {
			msg="this is our restriction";
			return this.restrictions;
		}
	}
	
	public ArrayList<program> filterD(String n ,ArrayList<program> P) {
		ArrayList <program> filterdP=new ArrayList<program>();
		for(program h:P) {
			if (h.get_level().equals(n)) {
				filterdP.add(h);
				msg="the program is added(difficulty)" ;
				System.out.println(msg);
			}
		}
		if (filterdP.isEmpty()) {
			msg="there is no program with this requirement";
			System.out.println("there is no program with this requirement");}
		
		return filterdP;
	}
	
	public ArrayList<program> filterF(String n,ArrayList<program> P) {
		
		ArrayList <program> filterdP=new ArrayList<program>();
		for (program h :P) {
			if (h.get_goals().equals(n)) {
				filterdP.add(h);
				msg="the program is added(focus area) " ;
				System.out.println(msg);
			}
		}
		if (filterdP.isEmpty()) {
			msg="there is no program with this requirement";
			System.out.println("there is no program with this requirement");}
		return filterdP;
		
	}
	///////////////////////////////////////
	public ArrayList<program> filters(String F,String D,ArrayList<program> P) {
		ArrayList <program> filterdP=new ArrayList<program>();
		/*
		for (program h:P) {
			
			if (h.get_goals().equals(F)) {
				if(h.get_level().equals(D)) {
				filterdP.add(h);
				msg="the program is added(focus area&difficulty) " ;
				System.out.println(msg);
				}
			}
		}
		*/
		filterdP = filterF(F,P);
		filterdP = filterD(D,filterdP);
		msg="your are in filters";
		if (filterdP.isEmpty()) {
			msg="there is no program with this requirement";
			System.out.println("there is no program with this requirements");}
		return filterdP;
		
	}
	
	public void schedulesView() {
		
		System.out.println("all the programs yoru enrolled in");
		 System.out.println();
			 for (program h:this.clientP) {
				 System.out.println(h.get_titel()+": "+h.get_duration());
				 System.out.println();
				 msg="schedulesView";
			 }
			
	}
	
	public ArrayList<program> getprograms(){
		msg="this is your programs";
		return clientP;
	}
	
	public void enroll(program p) {
		if(!this.clientP.contains(p)) {
			this.clientP.add(p);
			System.out.println("the program is added");
			msg="the program is enrolled";
		}
		else System.out.println("you have this program already");
			
	}
	
	public void delProgram(program P) {
		if(clientP.contains(P)) {
			clientP.remove(P);
			System.out.println("the program is deleted");
			msg="the program is deleted";
		}
		else System.out.println("you are not enrolled in this program in the first place");

	}
	
	
	
}
