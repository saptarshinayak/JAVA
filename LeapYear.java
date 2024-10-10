package com.java.practice1;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Start year : ");
		int s=sc.nextInt();
		System.out.println("End year : ");
		int e=sc.nextInt();
		Execution1 e1=new Execution1();
		e1.range(s, e);
	}
}
class Execution1{
	public void check(int y) {
		if((y%100!=0)&&(y%4==0)||(y%400==0)) System.out.println(y);
	}
	public void range(int s, int y) {
		for(int i=s;i<=y;i++) {
			check(i);
		}
	}
}