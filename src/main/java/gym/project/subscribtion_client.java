package gym.project;

public class subscribtion_client {
private String User_email;
private String type_of_subscription;
private String subsciription_expires;

public void set_useremail(String e) {
	this.User_email=e;
}
public void set_typeSub(String t) {
	this.type_of_subscription=t;
}
public void setsxpires(String x) {
	this.subsciription_expires=x;
}
public String get_email() {
	return User_email;
}
public String get_type() {
	return type_of_subscription;
}
public String get_expires() {
	return subsciription_expires;
}


}
