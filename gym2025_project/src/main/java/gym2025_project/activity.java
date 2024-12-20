package gym2025_project;

public class activity {
	
	    private String userEmail;
	    private int logins;
	    private int programsEnrolled;
	    private int messagesSent;
	    
	    public activity(String userEmail, int logins, int programsEnrolled, int messagesSent) {
	        this.userEmail = userEmail;
	        this.logins = logins;
	        this.programsEnrolled = programsEnrolled;
	        this.messagesSent = messagesSent;
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
      
      public void set_messagesSent(int message) {
    	  this.messagesSent=message;
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

	    public int getMessagesSent() {
	        return messagesSent;
	    }
	}

