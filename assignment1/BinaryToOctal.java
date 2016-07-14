package assignment1;


public class BinaryToOctal {

	// This function is used to convert 3 digits binary to octal and return it to octalConvertor
	public int tripletConvertor(int value){
		int sum =0 ,count = 0;
		while(count< 3){
			int temp = (value%10) * (int)Math.pow(2,count);
			sum = sum+temp;
			value=value/10;
			count++;
		}
		return sum;
	}
	
	// This function is used to convert the binary to octal
	// b_value is the binary input value
	// rem is the 3 binary value which going to convert into octal
	public int octalConvertor(int b_value) {
		int rem,count =0;
		int sum=0,temp =b_value;
		while(temp > 0){
			rem = temp%1000;
			sum = sum + tripletConvertor(rem)*(int) Math.pow(10,count);
			count++;
			temp = temp/1000;
		}
		return sum;
	}
}
