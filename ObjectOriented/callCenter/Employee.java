package callCenter;

public abstract class Employee {
	protected boolean isAvailable = true;
	protected Rank rank;
	
	
	public void handleCall(Call call){
		makeUnavailable();
	}
	
	public void endCall(){
		makeAvailable();
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}

	public void makeAvailable() {
		this.isAvailable = true;
	}
	
	public void makeUnavailable() {
		this.isAvailable = false;
	}
	
	
}
