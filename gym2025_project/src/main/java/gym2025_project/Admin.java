package gym2025_project;
import java.util.ArrayList;
import gym2025_project.subscribtion_client;
import gym2025_project.subscription_instructor;
import java.util.Iterator;
import gym2025_project.User;
import gym2025_project.activity;
public class Admin 
 {
	
public	String msg = null;
private String admin_name ="haya@gmail.com";
private String pass="123hh";
public static ArrayList<User> client=new ArrayList<User>();
public static ArrayList<User> instructor=new ArrayList<User>();
public static ArrayList<activity> Activity=new ArrayList<activity>();
public static ArrayList<subscribtion_client>subsc_clients =new ArrayList<subscribtion_client>();
public static ArrayList<subscription_instructor>subsc_instructor =new ArrayList<subscription_instructor>();
UserFitnessProgram q= new UserFitnessProgram();

public String get_admin_name() {
	return admin_name;
}
public String get_admin_pass() {
	return pass;
}

public boolean account_exists (User U1) {
	boolean exsist=false;
	for(User u:client) {
		if(u.get_numbphone()==U1.get_numbphone()) {
		exsist=true;
		}	
	}
	for(User u:instructor) {
		if(u.get_numbphone()==U1.get_numbphone()) {
		exsist=true;
		}	
	}
return exsist;
	
}

public boolean miss_info(User u) {
	boolean miss=false;
	if (u.get_username()==null) {
		System.out.println("username is required. Please enter a username.");
		miss=true;
	}
	if (u.get_pass()==null) {
		System.out.println("pass is required. Please enter a pass.");
		miss=true;
	}
	if(u.get_email()==null) {
		System.out.println("email is required. Please enter a email");
		miss=true;
	}
    if(u.get_numbphone()==null) {
    	System.out.println("numbphone is required. Please enter a numbphone");
		miss=true;
    }
    if(u.get_type()==null) {
    	System.out.println("type is required. Please enter a type.");
		miss=true;
    }
    if(u.get_age()==null) {
    	System.out.println("age is required. Please enter a age.");
		miss=true;
    }
    return miss;
}



public void creat_account(User U) {
	if(!(miss_info(U))){
	if(!(account_exists(U))) {
	if (U.get_type()=="active client") {
		client.add(U);
		this.msg="created clinet_account successfully";
	}
	else if (U.get_type()=="inactive client") {
		client.add(U);
		this.msg="created clinet_account successfully";
	}
	else if (U.get_type()=="pending instructor") {
         instructor.add(U);
         this.msg="created instructor_account successfully";
	}
	else
		this.msg="not created";
	
      }
	else 
		msg="User already added";
}
	else 
		msg="we canot creat account becouce miss information";
}

public void delete_account(String num) {
    msg = "user not found we cannot delete";

    Iterator<User> clientIterator = client.iterator();
    while (clientIterator.hasNext()) {
        if (clientIterator.next().get_numbphone().equals(num)) {
            clientIterator.remove();
            msg = "user deleted";
        }
    }

    Iterator<User> instructorIterator = instructor.iterator();
    while (instructorIterator.hasNext()) {
        if (instructorIterator.next().get_numbphone().equals(num)) {
            instructorIterator.remove();
            msg = "user deleted";
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
			    System.out.println("you have been accepted");
			    }
			}	
		}
}
public void add_user_activity(activity v) {
	Activity.add(v);
	System.out.println("user_activity added");
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
    
    System.out.println("Total Logins: " + totalLogins);
    System.out.println("Active Users: " + activeUsers);
    System.out.println("Inactive Users: " + inactiveUsers);
    
    msg="shown";
    
}

public void view_user_activity(String email) {
	msg="user not found";
	for (activity activit : Activity) {
    	if(email==activit.getUserEmail()) {
    		 System.out.println(activit.getUserEmail());
    		    System.out.println(activit.getLogins());
    		    System.out.println(activit.getProgramsEnrolled());
    		   
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
		System.out.println("email of client :"+sc.get_email());
		System.out.println("type of subscription :"+sc.get_type());
		System.out.println("subsciription expires :"+sc.get_expires());
		msg="shown";
		
	}
	public void show_subscriptionPlanForinstructor(subscription_instructor si) {
		System.out.println("email of instructor :"+ si.get_name());
		System.out.println("salay :"+ si.get_salary());
	
		msg="shown";
		
	}
   public void rgestration(User u,program p) {
	  p.countEnroll++;
	  
   }

   public String most_papularprogram(ArrayList<program>list) {
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
   
   public void trackProgram(ArrayList<program>list) {
		for (program m:list) {
			if(m.status=="active") {
				System.out.println("active program:"+m.get_titel());
			}
			if(m.status=="completed") {
				System.out.println("completed program:"+m.get_titel());
			}
		}
		 msg="done";
	}
	}
	
	
	



