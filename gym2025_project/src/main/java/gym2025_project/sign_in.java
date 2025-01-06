package gym2025_project;
import gym2025_project.Admin;
import gym2025_project.User;

public class sign_in {
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
		System.out.println("client logged in successfully");
		return;
	}
	else if (!c.get_email().equals(name) && c.get_pass().equals(pass)){
		a.msg="Wrong  email_c. Try again";	
		System.out.println("Wrong email_c. Try again");
		return;
	}
	else if (c.get_email().equals(name) && !c.get_pass().equals(pass)) {
		a.msg="Wrong pass_c. Try again";	
		System.out.println("Wrong pass_c. Try again");
		return;
	}
}
	for(User I:a.instructor) {
		if(I.get_email().equals(name) && I.get_pass().equals(pass)) {
			a.msg="instructor logged in successfully";
			System.out.println("instructor logged in successfully");
			return;
		}
		else if (!I.get_email().equals(name) && I.get_pass().equals(pass)) {
			a.msg="Wrong email_I. Try again";	
			System.out.println("Wrong email_I. Try again");
			return;
		}
		else if (I.get_email().equals(name) && !I.get_pass().equals(pass)) {
			a.msg="Wrong pass_I. Try again";	
			System.out.println("Wrong pass_I. Try again");
			return;
		}
	}
	
	if(user_email.equals(a.get_admin_name())&& pass.equals(a.get_admin_pass())) {
		a.msg="Admin logged in successfully";
		System.out.println("Admin logged in successfully");
		return;
	}
	else if(!user_email.equals(a.get_admin_name())&& pass.equals(a.get_admin_pass())) {
		a.msg="Wrong email_A. Try again";	
		System.out.println("Wrong email_A. Try again");
		return;
		
	}
	else if(user_email.equals(a.get_admin_name())&& ! pass.equals(a.get_admin_pass())) {
		a.msg="Wrong pass_A Try again";	
		System.out.println("Wrong pass_A. Try again");
		return;
		
	}
	
		
}
	
	}


