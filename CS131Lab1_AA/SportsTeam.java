package team;

public abstract class SportsTeam {
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int win;
	protected int losses;
	
	public SportsTeam() {
		
		this.teamName="";
		this.teamMascot="";
		this.headCoach="";
		this.win=0;
		this.losses=0;
		
	}//end empty-argument constructor 
	
	public SportsTeam(String teamName, String teamMascot, String headCoach ) {
		this.teamName = teamName;
	    this.teamMascot = teamMascot;
	    this.headCoach = headCoach;
	    this.win = 0;
	    this.losses = 0;
	    
	    
	}//end preferred constructor 
	
	double getWinPercentage() {
		
		return (double) win / (double) (win + losses);
		
	}//end getWinPerctage 
	
	public abstract double [] getStats();
		
	

} //end class
