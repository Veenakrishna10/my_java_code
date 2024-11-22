package o2_number_programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("enter a positive integer number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int res=1;
		for(int i=1; i<=no; i++)
		{
			 res = res*i;
		}
		System.out.println("factorial of " +no+" is " + res);
	}

}
