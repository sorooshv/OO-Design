package callCenter;

import java.util.ArrayList;
import java.util.List;

public class CallCenter {
	private final int LEVELS = 3;
	
	private final int NUM_RESPONDENTS = 10;
	private final int NUM_MANAGERS = 4;
	private final int NUM_DIRECTORS = 2;
	
	
	List<List<Employee>> Employees;
	
	List<List<Call>> callQueue;
	
	
	public CallCenter(){
		
	}
	
	public Employee getHandlerForCall(){
		for(Employee e : getRespondents()){
			if(e.isAvailable){
				return e;
			}
		}
		
		for(Employee e : getManagers()){
			if(e.isAvailable){
				return e;
			}
		}
		
		for(Employee e : getDirectors()){
			if(e.isAvailable){
				return e;
			}
		}
		return null;
		
	}
	public void dispatchCall(Caller caller){
		Call newCall = new Call(caller);
		dispatchCall(newCall);
	}
	
	public void dispatchCall(Call call){
		Employee emp = 	getHandlerForCall();
		if(emp != null){
			emp.handleCall(call);
			call.setHandler(emp);
		}
		else{
			call.reply("Wait in Line!");
			callQueue.get(call.getRank().getValue()).add(call);
		}
	}
	
	public List<Employee> getRespondents(){
		return Employees.get(0);
	}
	
	public List<Employee> getManagers(){
		return Employees.get(1);
	}
	
	public List<Employee> getDirectors(){
		return Employees.get(2);
	}
	
	
	
}
