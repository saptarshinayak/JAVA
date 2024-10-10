package com.java.numPrac1;
import java.util.Scanner;
public class Automorphic {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Start number : ");
		int st=s.nextInt();
		System.out.println("End number : ");
		int en=s.nextInt();
		Ex4 e1=new Ex4();
		e1.range(st,en);
	}
}
class Ex4{
	public boolean isAuto(int n, int sqn) {
		int c=0;
		while(n>0) {
			c=0;
			if((n%10)==(sqn%10)) {
				c++;
			}
			n/=10;
			sqn/=10;
		}
		if(c!=0) return true;
		else return false;
	}
	public void range(int s, int e) {
		for(int i=s;i<=e;i++) {
			if(isAuto(i,i*i)) System.out.println(i);
		}
	}
}