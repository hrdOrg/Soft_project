package gym2025project;


public class program {
 private String programtitel;
 private String duration;
 private String difficultylevel;
 private String goals;
 private String price;
 private String link;
 
 public void set_titel(String t) {
	 this.programtitel=t;
 }
 
 public void set_duration(String d) {
	 this.duration=d;
 }
 
 public void set_level(String l) {
	 this.difficultylevel=l;
 }
 
 public void set_goals(String g) {
	 this.goals=g;
 }
 
 public void set_price(String p) {
	 this.price=p;
 }
 
 public void set_link(String n) {
	 this.link=n;
 }
 
 public String get_titel() {	 
	 return programtitel;
 }
 
 public String get_duration() {	 
	 return duration;
 }
 
 public String get_level() {	 
	 return difficultylevel;
 }
 
 public String get_goals() {	 
	 return goals;
 }
 
 public String get_price() {	 
	 return price;
 }
 
 public String get_link() {	 
	 return link;
 }
 
 
 
 
 
 
 
 
 

}
