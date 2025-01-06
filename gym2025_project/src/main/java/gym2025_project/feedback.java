package gym2025_project;

import java.util.ArrayList;

public class feedback {
	
	public String massage;
	private ArrayList<Feed> feed = new ArrayList<Feed>(); 
	private ArrayList<rate> rate = new ArrayList<rate>();
	private ArrayList<Feed> Hist = new ArrayList<Feed>(); 
	private ArrayList<improvement> improve = new ArrayList<improvement>();
	
	//private ArrayList<improvement> improv = new ArrayList<improvement>();

	public void setImprovment(String i,String n) {
		improvement m =new improvement(i,n);
		this.improve.add(m);
		massage ="improvement is add";
		
	}
	
	public void handleImprovement(improvement i) {
		i.HandleImprov=true;
		//Hist.add(i);
		improve.remove(i);
		System.out.println("the improvment has been handled");
		massage="improvement handeled";
	}

	public ArrayList<improvement> getimprovement() {
		massage="improvement";
		return improve;
	} 
	
	public void setFeedback(String p, String ins, String fee) {
		Feed e= new Feed(p,ins,fee);
		this.feed.add(e);
		massage="the feedback is add";
	
	}
	public ArrayList<Feed> getFeedback() {
		massage="the feedback";
		return this.feed;
	}
	
	public void setRate(int r,String n) {
		rate R=new rate(r,n);
		this.rate.add(R);
		massage="the rate is add";
	}
	public ArrayList<rate> getRate() {
		massage="rates";
		return rate;
	}
	
	
	public double avgRate() {
		double avg=0;
		int size = rate.size();
		for (rate r:rate)
		avg += (double)r.rate;
		massage="avrage rate";
		return (double)avg/(double)size;
		
	}
	
	public void handleFeed(Feed F) {
		F.Handle=true;
		Hist.add(F);
		feed.remove(F);
		System.out.println("the feedback has been handeld");
		massage="feed handeled";
	}
	
	
	
}
