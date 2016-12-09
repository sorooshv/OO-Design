package parkingLot;

import java.util.List;

public class ParkingLot {
	
	private List<List<Stall>> stalls;
	private PaymentSystem paymentSystem = new PaymentSystem();
	
	
	
	public Stall getFirstAvailableStall(){
		for(List<Stall> list : stalls){
			for(Stall s : list){
				if(!s.isOccupied())
					return s;
			}
		}
		return null;
	}
	
	public void parkCar(Car c) throws Exception{
		Stall s = getFirstAvailableStall();
		if(s != null)
			parkCar(c,s);
		else
			throw new Exception("No empty stall found!");
	}
	
	public void parkCar(Car c, Stall s){
		if(!s.isOccupied()){
			s.setParkedCar(c);
		}
	}
	
	public List<Stall> getStallsByLevel(int level){
		if(level > (stalls.size() - 1))
			return null;
		else
			return stalls.get(level);
	}
	
}
