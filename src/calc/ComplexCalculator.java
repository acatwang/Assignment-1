// Name: Yi-Yin Wang

package calc;

public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	// subtract()
	// TODO subtracts d from current number
	public void subtract(double d){
		currentNumber = currentNumber - d; 
	}
	
	// multiply()
	// TODO multiplies current number by d
	public void multiply(double d){
		currentNumber = currentNumber * d;
	}
	
	// divide()
	// TODO divides current number by a given number
	public void divide(double d){
		currentNumber = currentNumber / d;
	}
	
	
	// clear()
	// TODO sets current number to 0
	public void clear(){
		currentNumber = 0;
	}
	
	// power()
	// TODO raises current number to the power of a given number
	public void power(int p){
		currentNumber = Math.pow(currentNumber, p);
	}
	
	public double getCurrentNumber() {
		return currentNumber;
	}
	

	// EXTRA FUNCTIONS - not needed for full credit //
	
	// isEven()
	// TODO returns true is current number is even, false otherwise
	public boolean isEven(){
		if (currentNumber % 2 ==0){
			return true;
		}else{
			return false;
		}
	}
	
	
	// isPrime()
	// TODO returns true if current number is a prime number, false otherwise
	
	public boolean isPrime(){
		int upperBound = (int) Math.sqrt(currentNumber)+1;
		for(int i =2; i < upperBound; i++){
			if (currentNumber % i ==0){
				return false;		
			}			
		}
		return true;
		
	}
	

}
