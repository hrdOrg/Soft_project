package gym2025_project;

public class User {
private String username;
private Integer age;
private String email;
private String pass;
private String numbphone;
private String type;

public void set_username(String name) {
	this.username=name;
}

public void set_age( Integer age) {
	this.age=age;
}

public void set_email(String email) {
	this.email=email;
}
public void set_pass(String pass) {
	this.pass=pass;
}
public void set_numbphone(String numberphone) {
	this.numbphone=numberphone;
}
public void set_type(String type) {
	this.type=type;
}
public String get_username() {
	return username;
}
public Integer get_age() {
	return age;
}

public String get_email() {
	return email;
}
public String get_numbphone() {
	return numbphone;
}
public String get_pass() {
	return pass;
}

public String get_type() {
	return type;
}



}
