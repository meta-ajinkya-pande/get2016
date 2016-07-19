package assignment1;

public class LargestDigitRecursion {
	/* In This It check unit digit every time and 
	 * if max is less then that unit digit then max becomes that digit.
	 */
	public int largestDigit(int x,int max){
		if(x == 0){
			return max;
		}
		else{
			if(x%10 > max){
				max = x%10;
			}
			return largestDigit(x/10, max);
		}
	}
}
