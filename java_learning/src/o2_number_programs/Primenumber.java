package o2_number_programs;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		boolean result=true;
		System.out.println("enter a integer number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				result=false;
				break;
			}
		}
		if(result==true)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("not a prime no");
		}
	}

}
