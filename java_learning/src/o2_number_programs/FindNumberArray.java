package o2_number_programs;

public class FindNumberArray {

	public static void main(String[] args) {
		
		// declare the array
		int a [] = {7,8,19,21,27};
		
		//index     0 1  2  3  4
		
		int index=0;
		int item=19;
		int result=0;
		for(int i=0; i<a.length;i++)
		{
			if(item==a[i])
			{
				result = 1;
				index = i;
				break;
			}
		}
		if(result==1)
		{
			System.out.println(item + " is present at index " + index);
		}
		else
		{
			System.out.println(item + " is not present in the array");
		}
}
}
