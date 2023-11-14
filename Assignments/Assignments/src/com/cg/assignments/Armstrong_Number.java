package com.cg.assignments;

public class Armstrong_Number {

	public static void main(String[] args) {
		int n1=5678;
		int t=n1;
		int r,sum=0;
		while(n1>0) {
			r=n1%10;
			sum=sum+(r*r*r);
			n1=n1/10;	
		}
		if(t==sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}

	}

}
