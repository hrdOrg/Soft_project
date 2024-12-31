package gym2025project;

import java.util.ArrayList;

public class client_msg {
private String name;
private String email;
public static ArrayList<String>msgsent =new ArrayList<String>();
public static ArrayList<String>feedback =new ArrayList<String>();
public static ArrayList<String>motivation =new ArrayList<String>();
public static ArrayList<String>notification =new ArrayList<String>();
public String msgg;

public void set_name(String n) {
this.name=n;
}
public String get_name() {
	return this.name;
}
public String get_email() {
	return this.email;
}

public void set_email(String e) {
	this.email=e;
}

public void send_motivation_to_client(String msg) {
	msgsent.add(msg);
	msgg="motivation sent succesfully";
}

public void send_massege_to_client(String msg) {
	msgsent.add(msg);
	msgg="msg sent succesfully";
}

public void send_feedback_to_client(String feed) {
	feedback.add(feed);
	msgg="feedback sent succesfully";
	
}

public void set_Notification(String s) {
	notification.add(s);
	msgg="notification sent succesfully";
}

}