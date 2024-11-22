package o2_number_programs;

import java.util.Scanner;

public class Armstrongno {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int num=153;
	int sum=0;
	int ld=0;
	int t=num;
	while(num>=1)
	{
		ld=num%10;
		sum=sum+(ld*ld*ld);
		num=num/10;
	}
	if(sum==t)
	{
		System.out.println("yes armstrong no");
	}
	else
	{
		System.out.println("not a armstrong no");
	}
}
}
