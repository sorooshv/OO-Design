package parkingLot;

public class Stall {
	private int level;
	private int number;
	private boolean occupied = false;
	private Car car;
	
	public Stall(int level, int number){
		this.level = level;
		this.number = number;
	}

	public boolean isOccupied() {
		return occupied;
	}
	
	public void setOccupied() {
		 this.occupied= true;
	}
	
	public void setVacant() {
		this.occupied= false;
	}
	
	public void setParkedCar(Car car){
		this.car = car;
		setOccupied();
	}
	
	
	
}
