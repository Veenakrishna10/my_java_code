package o2_number_programs;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	System.out.println("enter a integer number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int t=num;
	int ld=0;
	int reverse=0;
	while(num>=1)
	{
		ld=num%10;
		reverse=reverse*10+ld;
		num=num/10;
	}
	if(t==reverse)
	{
		System.out.println("palindromre");
	}
	else
	{
		System.out.println("not a palindrome");
	}
}
}
