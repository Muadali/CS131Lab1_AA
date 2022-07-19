package team;

public class BasketballTeam extends SportsTeam {
	
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	
	public BasketballTeam() {
		this.fieldGoals= 0;
		this.fieldGoalsAttempted=0;
		this.freeThrows=0;
		this.freeThrowsAttempted=0;
		
		
	}//end empty-argument constructor
	
	public BasketballTeam (String teamName, String teamMascot, String headCoach) {
		
		this.teamName=teamName;
		this.teamMascot=teamMascot;
		this.headCoach=headCoach;
		this.fieldGoals=0;
		this.fieldGoalsAttempted=0;
		this.freeThrows=0;
		this.freeThrowsAttempted=0;
		
	} //end preferred constructor
	
	double fieldGoalPercentage() {
		return (double ) fieldGoals/(double) (fieldGoalsAttempted);
		
		
	}//end fieldGoalPercentage
	
	double freeThrowPercentage() {
		
		return (double)freeThrows/(double) (freeThrowsAttempted);
		
	} //end fieldGoalPercentage
	
	public double[] getStats() {
	    double arr[] = new double[3];
	    arr[0] = super.getWinPercentage();
	    arr[1] = fieldGoalPercentage();
	    arr[2] = freeThrowPercentage();
	    return arr;
	  }
	
	
	
	
	
	
	

}//end class
