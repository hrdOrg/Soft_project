package softwareProject;

import java.util.ArrayList;

class Feed{
	public int prog;
	public String instr;
	public String feedb;
	public boolean Handle=false;
	
	public Feed() {
		
	}
	public Feed(int p, String i, String f) {
		this.prog=p;
		this.instr=i;
		this.feedb=f;
	}
	
}

class improvement{
	public String inst;
	public String imp;
	public boolean HandleImprov=false;
	
	public improvement() {
		
	}
	public improvement(String i, String m) {
		this.inst=i;
		this.imp=m;
	}
}

public class feedback {
	
	private ArrayList<Feed> feed = new ArrayList<Feed>(); 
	private ArrayList<Integer> rate = new ArrayList<Integer>();
	private ArrayList<Feed> Hist = new ArrayList<Feed>(); 
	
	private ArrayList<improvement> improv = new ArrayList<improvement>();

	public void setImprovment(String i,String n) {
		improvement m =new improvement();
		m.imp=i;
		m.inst=n;
		this.improv.add(m);
		
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
	
	public void setFeedback(int p, String ins, String fee) {
		Feed e= new Feed();
		e.feedb=fee;
		e.instr=ins;
		e.prog=p;
		this.feed.add(e);
	
	}
	public Feed getFeedback() {
		return this.feed.getFirst();
	}
	
	public void setRate(int r) {
		this.rate.add(r);
	}
	public int getRate() {
		return rate.getFirst();
	}
	public int getRateIndex(int i) {
		return rate.get(getRateIndex(i));
	}
	
	public double avgRate() {
		int avg=0;
		int size = rate.size();
		for (int i=0; i<size;i++)
		avg += rate.get(i);
		return (double)avg/(double)size;
		
	}
	
	public void handle(Feed F) {
		F.Handle=true;
		Hist.add(F);
		feed.remove(F);
		System.out.println("the feedback has been handeld");
	}

	
	
}
