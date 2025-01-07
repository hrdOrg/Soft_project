package gym.project;
import java.util.logging.Logger;
public class sign_in {
public static final Logger logger = Logger.getLogger(sign_in.class.getName());
private String user_email;
private String pass;


public void set_username(String username) {
	this.user_email=username;
	
}
public void set_pass(String pass) {
	this.pass=pass;
}

public void sign_in (String name,String pass,Admin a) {
this.pass=pass;
this.user_email=name;
for(User c:a.client) {
	if(c.get_email().equals(name) && c.get_pass().equals(pass)) {
		a.msg="client logged in successfully";
		logger.info("client logged in successfully");
		return;
	}
	else if (!c.get_email().equals(name) && c.get_pass().equals(pass)){
		a.msg="Wrong  email_c. Try again";	
		logger.info("Wrong email_c. Try again");
		return;
	}
	else if (c.get_email().equals(name) && !c.get_pass().equals(pass)) {
		a.msg="Wrong pass_c. Try again";	
		logger.info("Wrong pass_c. Try again");
		return;
	}
}
	for(User I:a.instructor) {
		if(I.get_email().equals(name) && I.get_pass().equals(pass)) {
			a.msg="instructor logged in successfully";
			logger.info("instructor logged in successfully");
			return;
		}
		else if (!I.get_email().equals(name) && I.get_pass().equals(pass)) {
			a.msg="Wrong email_I. Try again";	
			logger.info("Wrong email_I. Try again");
			return;
		}
		else if (I.get_email().equals(name) && !I.get_pass().equals(pass)) {
			a.msg="Wrong pass_I. Try again";	
			logger.info("Wrong pass_I. Try again");
			return;
		}
	}
	
	if(user_email.equals(a.get_admin_name())&& pass.equals(a.get_admin_pass())) {
		a.msg="Admin logged in successfully";
		logger.info("Admin logged in successfully");
		return;
	}
	else if(!user_email.equals(a.get_admin_name())&& pass.equals(a.get_admin_pass())) {
		a.msg="Wrong email_A. Try again";	
		logger.info("Wrong email_A. Try again");
		return;
		
	}
	else if(user_email.equals(a.get_admin_name())&& ! pass.equals(a.get_admin_pass())) {
		a.msg="Wrong pass_A Try again";	
		logger.info("Wrong pass_A. Try again");
		return;
		
	}
	
		
}
	
	}


