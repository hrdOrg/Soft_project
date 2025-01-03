package softwareProject;

public class schedule {
	
	private String titel;
	private String date;
	private String time;
	private String type;
	private String meeting_Place;
	
	public void set_titel(String t) {
		this.titel=t;
	}
	
	public void set_date(String d) {
		this.date=d;
	}
	
	public void set_type(String T) {
		this.type=T;
	}
	
	public void set_time(String Time) {
		this.time=Time;
	}
	
	public void set_place(String m) {
		this.meeting_Place=m;
	}
	
	public String get_titel() {
		return titel;
	}
	
	public String get_date() {
		return date;
	}
	
	public String get_time() {
		return time;
	}
	
	public String get_type() {
		return type;
	}
	
	public String get_place() {
		return meeting_Place;
	}
	
	

}