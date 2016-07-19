package assignment1;

public class RemainderRecursion {
	
	// It Return the remainder by repetitive minus operation
	public int rem(int x,int y){
		if(x<0 || y<=0)
			throw new IllegalArgumentException();
		else if(x-y==0)
			return 0;
		else if(x<y)
			return x;
		else
			return rem(x-y,y);
	}
}
