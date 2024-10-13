package com.java.numPrac1;
import java.util.Scanner;
public class Happy {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number : ");
		int n=s.nextInt();
		//System.out.println("Sum : "+sum(n));
		int sum=check(n);
		System.out.println(sum);
		if(sum==1) System.out.println("Yes!");
		else System.out.println("No!");
	}
	static int sum(int n) {
		int s=0,rem=0;
		while(n>0) {
			rem=n%10;
			s+=rem*rem;
			n/=10;
		}
		return s;
	}
	static int check(int n) {
		int s=sum(n);
		while(s>9) {
			s=sum(s);
		}
		return s;
	}
}
