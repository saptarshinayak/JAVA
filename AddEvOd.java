package com.java.numPrac1;
import java.util.Scanner;
public class AddEvOd {
	public static void main(String[] ar) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number : ");
		int n=s.nextInt();
		Ex3 e1=new Ex3();
		int os=0,es=0;
		e1.sumEO(n, os, es);
	}
}
class Ex3{
	public void sumEO(int n, int os, int es) {
		while(n>0) {
			if((n%10)%2==0) es+=(n%10);
			else os+=(n%10);
			n/=10;
		}
		System.out.println("Odd sum : "+os+"      Even sum : "+es);
	}
}