package o2_number_programs;

public class LargestInArray {
	public static void main(String[] args)
	{
	int a[] = {7,8,19,21,20,27};	
	
	int largest = a[0];
	
	for(int i=1; i<a.length; i++)
	{
		if(largest<a[i])   
		{
			largest = a[i];
			// 7 < 8     largest=8
			// 8 < 19    largest=19
			//19 < 21    largest=21
			//21  < 20    largest=21
			//20 < 27     largest=27
		}
	}
	System.out.println("the largest number is " + largest);
	}

}
