package gym2025_project;

import java.util.ArrayList;

 



public class feedback {
	
	public String massage;
	private ArrayList<Feed> feed = new ArrayList<Feed>(); 
	private ArrayList<rate> rate = new ArrayList<rate>();
	private ArrayList<Feed> Hist = new ArrayList<Feed>(); 
	
	private ArrayList<improvement> improv = new ArrayList<improvement>();

	public void setImprovment(String i,String n) {
		improvement m =new improvement();
		m.imp=i;
		m.inst=n;
		this.improv.add(m);
		massage ="improvement is add";
		
	}
	
	public void handleImprovement(improvement i) {
		i.HandleImprov=true;
		//Hist.add(i);
		improv.remove(i);
		System.out.println("the improvment has been handled");
	}

	public improvement getimprovement() {
		return improv.getFirst();
	} 
	
	public void setFeedback(String p, String ins, String fee) {
		Feed e= new Feed();
		e.feedb=fee;
		e.instr=ins;
		e.prog=p;
		this.feed.add(e);
		massage="the feedback is add";
	
	}
	public Feed getFeedback() {
		return this.feed.getFirst();
	}
	
	public void setRate(int r,String n) {
		rate R=new rate();
		R.rate=r;
		R.clientN=n;
		this.rate.add(R);
		massage="the rate is add";
	}
	public rate getRate() {
		return rate.getFirst();
	}
	
	
	public double avgRate() {
		int avg=0;
		int size = rate.size();
		for (int i=0; i<size;i++)
		avg += rate.get(i).rate;
		return (double)avg/(double)size;
		
	}
	
	public void handle(Feed F) {
		F.Handle=true;
		Hist.add(F);
		feed.remove(F);
		System.out.println("the feedback has been handeld");
	}

	
	
}
