package wc01.oef01;

import java.util.Random;

public class BusinessLogic {
	String naam;
	int currentNumber = -1;
	int nextNumber = -1;
	int count;
	Random rand = new Random();
	
	public BusinessLogic() {
		super();
		this.count = 0;
		this.setNextNumber();
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getCurrentNumber() {
		return currentNumber;
	}
	public void setCurrentNumber(int currentNumber) {
		this.currentNumber = currentNumber;
	}
	public int getNextNumber() {
		return nextNumber;
	}
	public void setNextNumber() {
		setCurrentNumber(nextNumber);
		this.nextNumber = rand.nextInt(21);
	}
	public int getCount() {
		return count;
	}
	public void setCount() {
		this.count++;
	}
	
	public boolean checkHogerLager(){
		if(this.currentNumber < this.nextNumber){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
}
