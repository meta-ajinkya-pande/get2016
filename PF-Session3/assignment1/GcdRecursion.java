package assignment1;

public class GcdRecursion {
	// It return the gcd of two numbers.
	public int gcd(int x, int y){
		if(x<y)
			return gcd(y,x);
		
		if(x%y == 0)
			return y;
		else 
			return gcd(y,x%y);
	}
}
