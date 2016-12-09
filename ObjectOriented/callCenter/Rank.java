package callCenter;

public enum Rank {
	Respondent(0), Manager(1), Director(2);
	
	private int val;
	
	private Rank(int val){
		this.val = val;
	}
	
	public int getValue(){
		return this.val;
	}
}
