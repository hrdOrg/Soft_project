package gym2025_project;

import java.util.ArrayList;

public class client_msg {
private String name;
private String email;
public static ArrayList<String>msgsent =new ArrayList<String>();
public static ArrayList<String>feedback =new ArrayList<String>();

public void set_name(String n) {
this.name=n;
}
public String get_name() {
	return this.name;
}
public String get_email() {
	return this.name;
}

public void set_email(String e) {
	this.email=e;
}

public void send_massege_to_client(String msg) {
	msgsent.add(msg);
}

public void send_feedback_to_client(String feed) {
	feedback.add(feed);
	
}

}
