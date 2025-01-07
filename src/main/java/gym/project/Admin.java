package gym.project;

import java.util.ArrayList;



import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
public class Admin 
 {
public static final Logger logger = Logger.getLogger(Admin.class.getName());
	
	
public String msg ;
private String admin_name ="haya@gmail.com";
private String pass="123hh";
public static List<User> client=new ArrayList<User>();
public static List<User> instructor=new ArrayList<User>();
public static List<activity> Activity=new ArrayList<activity>();
public static List<subscribtion_client>subsc_clients =new ArrayList<subscribtion_client>();
public static List<subscription_instructor>subsc_instructor =new ArrayList<subscription_instructor>();

UserFitnessProgram q= new UserFitnessProgram();
Scanner scanner=new Scanner(System.in);

public void fill_info(User u) {
	
    logger.info("Enter your username: ");
    String nameee = scanner.nextLine();
    u.set_username(nameee);

    logger.info("Enter your age: ");
    int age = scanner.nextInt();
    u.set_age(age);

    logger.info("Enter your email: ");
    scanner.nextLine();
    String emailll = scanner.nextLine();
    u.set_email(emailll);

    logger.info("Enter your password: ");
    String pass = scanner.nextLine();
    u.set_pass(pass);

    logger.info("Enter your phone number: ");
    String number = scanner.nextLine();
    u.set_numbphone(number);

    
    logger.info("Enter your type: ");
    String type = scanner.nextLine();
    u.set_type(type);
    
	msg="your data fiiled";
}

public String get_admin_name() {
	return admin_name;
}
public String get_admin_pass() {
	return pass;
}

public void update(String f,String w) {
    boolean userFound = false;
    

    for (User u : client) {
        if (u.get_numbphone().equals(f)) {
        	
        	if(w.equals("name")) {
            logger.info("Enter new username:");
            String NA = scanner.nextLine();
            u.set_username(NA);
            msg="name updated";
        	}
            else if(w.equals("email")) {
            	logger.info("Enter new email:");
	            String NA = scanner.nextLine();
	            u.set_email(NA);
	            msg="email updated";
            }
            else if(w.equals("pass")) {
            	  logger.info("Enter new pass:");
		            String NA = scanner.nextLine();
		            u.set_pass(NA);
		            msg="pass updated";
            }
            
        	
            else if(w.equals("type")) {
            	logger.info("Enter new type:");
	            String NA = scanner.nextLine();
	            u.set_type(NA);
	            msg="type updated";
        }
        	
            else if(w.equals("age")) {
            	 logger.info("Enter new age:");
		            int NA = scanner.nextInt();
		            u.set_age(NA);
		            msg="age updated";
         }
        	
            userFound = true;
           
        }
        
        
    }

    if (!userFound) {
        for (User m : instructor) {
            if (m.get_numbphone().equals(f)) {
            	if(w.equals("name")) {
                    logger.info("Enter new username:");
                    String NA = scanner.nextLine();
                    m.set_username(NA);
                    msg="name updated";
                	}
                    else if(w.equals("email")) {
                    	logger.info("Enter new email:");
        	            String NA = scanner.nextLine();
        	            m.set_email(NA);
        	            msg="email updated";
                    }
                    else if(w.equals("pass")) {
                    	  logger.info("Enter new pass:");
        		            String NA = scanner.nextLine();
        		            m.set_pass(NA);
        		            msg="pass updated";
                    }
                  
                	
                    else if(w.equals("type")) {
                    	logger.info("Enter new type:");
        	            String NA = scanner.nextLine();
        	            m.set_type(NA);
        	            msg="type updated";
                }
                	
                    else if(w.equals("age")) {
                    	 logger.info("Enter new age:");
        		            int NA = scanner.nextInt();
        		            m.set_age(NA);
        		            msg="age updated";
                 }
                userFound = true;
               
            }
        }
    }
    if(!userFound) {
    	msg="user not found";
    }
   
}

public boolean account_exists (User U1) {
	boolean exsist=false;
	for(User u:client) {
		if(u.get_numbphone().equals(U1.get_numbphone())) {
		exsist=true;
		}	
	}
	for(User u:instructor) {
		if(u.get_numbphone().equals(U1.get_numbphone())) {
		exsist=true;
		}	
	}
return exsist;
	
}

public boolean miss_info(User u) {
	boolean miss=false;
	if (u.get_username().equals("")) {
		logger.info("username is required. Please enter a username.");
		miss=true;
	}
	if (u.get_pass().equals("")) {
		logger.info("pass is required. Please enter a pass.");
		miss=true;
	}
	if(u.get_email().equals("")) {
		logger.info("email is required. Please enter a email");
		miss=true;
	}
    if(u.get_numbphone().equals("")) {
    	logger.info("numbphone is required. Please enter a numbphone");
		miss=true;
    }
    if(u.get_type().equals("")) {
    	logger.info("type is required. Please enter a type.");
		miss=true;
    }
    if(u.get_age().equals(0)) {
    	logger.info("age is required. Please enter a age.");
		miss=true;
    }
    return miss;
}



public void creat_account(User U) {
	if(!(miss_info(U))){
	if(!(account_exists(U))) {
	if (U.get_type().equals("active client")) {
		client.add(U);
		logger.info("created clinet_account successfully");
		this.msg="created clinet_account successfully";
	}
	else if (U.get_type().equals("inactive client")){
		client.add(U);
		logger.info("created clinet_account successfully");
		this.msg="created clinet_account successfully";
	}
	else if (U.get_type().equals("pending instructor")) {
         instructor.add(U);
         logger.info("created instructor_account successfully");
         this.msg="created instructor_account successfully";
	}
	else {
		this.msg="not created";
	 logger.info("not created");
	}
      }
	else {
		msg="User already added";
	 logger.info("User already added");
	}
}
	else { 
		msg="we canot creat account becouce miss information";
	logger.info("we canot creat account becouce miss information");
	}
}

public void delete_account(String num) {
    msg = "user not found we cannot delete";

    Iterator<User> clientIterator = client.iterator();
    while (clientIterator.hasNext()) {
        if (clientIterator.next().get_numbphone().equals(num)) {
            clientIterator.remove();
            msg = "user deleted";
            logger.info("user deleted");
        }
    }

    Iterator<User> instructorIterator = instructor.iterator();
    while (instructorIterator.hasNext()) {
        if (instructorIterator.next().get_numbphone().equals(num)) {
            instructorIterator.remove();
            msg = "user deleted";
            logger.info("user deleted");
        }
    }
}

public boolean status_instructor(String ema) {
    boolean status=false;
    for(User u:instructor) {
		if(u.get_email().equals(ema)) {
		    if(u.get_type().equals("pending instructor")) {
		    	status=true;
		    
		    }
		}	
	}
    return status;
}

public void approve_instructor(String e) {
	 for(User u:instructor) {
			if(u.get_email().equals(e)) {
			    if(status_instructor(e)) {
			    	
			    u.set_type("active instructor");
			    msg="you have been accepted";
			    logger.info("you have been accepted");
			    }
			}	
		}
}
public void add_user_activity(activity v) {
	Activity.add(v);
	//logger.info("user_activity added");
}



public void viewOverallStatistics() {
    int totalLogins = 0;
    int activeUsers = 0;
    int inactiveUsers = 0;

    for (User user : client) {
        if (user.get_type().equalsIgnoreCase("active client")) {
            activeUsers++;
        } else {
            inactiveUsers++;
        }
   

}
    for (activity activit : Activity) {
    	totalLogins+=activit.getLogins();
    }
    
    logger.info("Total Logins: " + totalLogins);
    logger.info("Active Users: " + activeUsers);
    logger.info("Inactive Users: " + inactiveUsers);
    
    msg="shown";
    
}

public void view_user_activity(String email) {
	msg="user not found";
	for (activity activit : Activity) {
    	if(email.equals(activit.getUserEmail())) {
    		 logger.info(activit.getUserEmail());
    		    logger.info(""+activit.getLogins());
    		    logger.info(""+activit.getProgramsEnrolled());
    		   
    		    msg="user found";
    	}
    	
    }
	
    	}
	
	public void add_SubscriptionplanForClient(subscribtion_client sc) {
		subsc_clients.add(sc);
		msg="added";
	}
	
	public void add_SubscriptionplanForinstructor(subscription_instructor si) {
		subsc_instructor.add(si);
		msg="added";
	}
	
	public void delete_SubscriptionplanForClient(String email) {
	    Iterator<subscribtion_client> iterator = subsc_clients.iterator();
	    while (iterator.hasNext()) {
	        subscribtion_client sc = iterator.next();
	        if (sc.get_email().equals(email)) {
	            iterator.remove();
	            msg = "deleted";
	            return;
	        }
	    }
	    msg = "undeleted, not found";
	}
	
	public void delete_SubscriptionplanForinstructor(String email) {
	    Iterator<subscription_instructor> iterator = subsc_instructor.iterator();
	    while (iterator.hasNext()) {
	        subscription_instructor si = iterator.next();
	        if (si.get_name().equals(email)) {
	            iterator.remove();  
	            msg = "deleted";
	            return;
	        }
	       
	    }
	    msg = "undeleted,not found";
	}
	
	public void show_subscriptionPlanForClient(subscribtion_client sc) {
		logger.info("email of client :"+sc.get_email());
		logger.info("type of subscription :"+sc.get_type());
		logger.info("subsciription expires :"+sc.get_expires());
		msg="shown";
		
	}
	public void show_subscriptionPlanForinstructor(subscription_instructor si) {
		logger.info("email of instructor :"+ si.get_name());
		logger.info("salay :"+ si.get_salary());
	
		msg="shown";
		
	}
   public void rgestration(User u,program p) {
	  p.countEnroll++;
	  
   }

   public String most_papularprogram(List<program>list) {
	   int max=0;
	   String papular_program=null;
	   for(program m:list) {
		   if(m.countEnroll>max) {
			   max=m.countEnroll;
			   papular_program=m.get_titel();
		   }
	   }
	   msg="popular program shown";
	   return   papular_program;
	  
   }
   
   public void report_progress(UserFitnessProgram u) {
	   
	   u.displayProgress();
	   msg="repot genrated";
   }
   
   public void trackProgram(List<program>list) {
		for (program m:list) {
			if(m.status=="active") {
				logger.info("active program:"+m.get_titel());
			}
			if(m.status=="completed") {
				logger.info("completed program:"+m.get_titel());
			}
		}
		 msg="done";
	}
	}
	
	
	



