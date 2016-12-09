package callCenter;

public class Call {
	private Caller caller;
	private Rank rank;
	private Employee handler;
	
	public Call(Caller caller){
		this.caller = caller;
		this.rank = Rank.Respondent;
	}
	
	public void reply(String message){
		
	}
	
	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Caller getCaller() {
		return caller;
	}
	
	public void setHandler(Employee e){
		this.handler = e;
	}
}
