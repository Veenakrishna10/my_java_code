package o2_number_programs;

public class Bubblesort {

	public static void main(String[] args) {
		
		int a []= {5,8,4,3,1};
		//System.out.println("a.length");
		for(int i=1; i<=a.length; i++)
		{
			for(int j=0; j<=a.length-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int t = a[j];
					a[j]= a[j+1];
					a[j+1] = t;
				}
			}
		}
System.out.println("sorted array");
for(int i=0; i<=a.length;i++)
{
	System.out.print(a[i] + " ");
}
	}

}
