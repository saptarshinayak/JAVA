package com.java.numPrac1;
import java.util.Scanner;
public class SumDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number : ");
		int n=sc.nextInt();
		Sum s1=new Sum();
		s1.sumD(n);
	}
}
class Sum{
	public void sumD(int n) {
		int sum=0;
		while(n>0) {
			sum+=(n%10);
			n/=10;
		}
		System.out.println(sum);
	}
}