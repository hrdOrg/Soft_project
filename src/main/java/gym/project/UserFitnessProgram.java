package gym.project;

import java.util.logging.Logger;

public class UserFitnessProgram {
	public static final Logger logger = Logger.getLogger(UserFitnessProgram.class.getName());
    public String msg;
    private User name;
   // private String programName;
    private program p;
    private String gender;
    private double weight;
    private double height;
    private String fitnessGoal; 
    private int totalSessions;
    private int completedSessions; 
    
    public void set_name(User uu) {
		this.name=uu;
	}
    
    public void set_programName(program pp) {
    	this.p=pp;
    }
   
    public void set_gender(String g) {
		this.gender=g;
	}
    
    public void set_weight(double w) {
		this.weight=w;
	}
    
    public void set_hight(double h) {
		this.height=h;
	}
    
    public void set_fitnessGoal(String G) {
		this.fitnessGoal=G;
	}
    
    public void set_totalSessions(int t) {
		this.totalSessions=t;
	}
    
    public void set_completedSessions(int c) {
		this.completedSessions=c;
	}
    
    
    public String get_name() {
    	return this.name.get_username();
    }
    
    public String get_programName() {
    	return this.p.get_titel();
    }
    
 
    
    public String get_gender() {
    	return this.gender;
    }
    
    public double get_weight() {
    	return this.weight;
    }
    
    public double get_height() {
    	return this.height;
    }
    
    public String get_fitnessGoal() {
    	return this.fitnessGoal;
    }
    
    public int get_totalSessions(){
    	return this.totalSessions;	
    }
      
    public int get_completedSessions() {
    	return this.completedSessions;
    }
    
    
    
    
    public UserFitnessProgram(String name,String pName, String gender, double weight,
    		double height, String fitnessGoal, int totalSessions) {
        this.name.set_username(name);
        this.p.set_titel(pName);
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.fitnessGoal = fitnessGoal;
        this.totalSessions = totalSessions;
        this.completedSessions = 0; 
    }
    
    public UserFitnessProgram() {
    
    }

   
    public void completeSession() {
        if (completedSessions < totalSessions) {
            completedSessions++;
            logger.info(name.get_username() + completedSessions + "/" + totalSessions);
        } else {
            logger.info("Done , Good Job 😣");
        }
        
        msg="Update the client’s completion rate";
    }
    
   public void updateStatusprogram(program p) {
	    if (completedSessions < totalSessions) {
          p.status="active";
        } else {
        	 p.status="completed";
        }  
    } 
   
   
    public void displayProgress() {
        logger.info("client name:"+name.get_username());
        logger.info("program name:"+p.get_titel());
        logger.info("fitnessGoal:"+fitnessGoal);
        logger.info("attendence:"+completedSessions + "/" + totalSessions);
        double progress = ((double) completedSessions / totalSessions) * 100;
        logger.info("progress :"+String.format("%.2f", progress) + "%");
        logger.info("current weight status:");
       double b= calculateBMI();
    }

  
    public void updateWeight(double newWeight) {
        this.weight = newWeight;
        logger.info("Update Weight to" + weight + "Kg");
    }
    
    

    public double calculateBMI() {
        double BMI = weight / (height * height);
        if(BMI>19 && BMI<25) {
        	
        	logger.info("Normal Weight");
        }
        
        else if(BMI>25) 
        	logger.info("OverWeight");
        else 
        	logger.info("UnderWeight");
        
        return BMI;
    }
    
}
