package gym2025_project;

import java.util.ArrayList;

public class activity {
	
	    private String userEmail;
	    private int logins;
	    private int programsEnrolled;
	   // public static ArrayList<String> programenroll=new ArrayList<String>();
	   
	    
	    public activity(String userEmail, int logins, int programsEnrolled) {
	        this.userEmail = userEmail;
	        this.logins = logins;
	        this.programsEnrolled = programsEnrolled;
	    }
	    public activity() {
	    	
	    }

	    public void set_useremail(String email ) {
	    	this.userEmail=email;
	    }
	    public void Set_logins(int log) {
	    	this.logins=log;
	    }
      public void set_programenroll(int programenroll) {
    	  this.programsEnrolled=programenroll;
      }
      
     
	    public String getUserEmail() {
	        return userEmail;
	    }

	    public int getLogins() {
	        return logins;
	    }

	    public int getProgramsEnrolled() {
	        return programsEnrolled;
	    }

	   
	}

