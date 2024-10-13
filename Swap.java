package com.java.numPrac1;
import java.util.Scanner;
public class Swap {
	public static void main(String[] a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number 1 : ");
		int n1=sc.nextInt();
		System.out.println("Number 2 : ");
		int n2=sc.nextInt();
		System.out.print("Before swapping : "+"Number 1: "+n1+"  Number 2: "+n2);
		swap(n1, n2);
	}
	static void swap(int n1, int n2) {
		int t=n1+n2;
		n2=t-n2;
		n1=t-n1;
		System.out.print("\nAfter swapping : "+"Number 1: "+n1+"  Number 2: "+n2);
	}
}
