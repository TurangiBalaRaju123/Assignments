package com.cg.assignments;

public class Star_program {

	public static void main(String[] args) {
		int n=3;
		for(int i=0;i<n;i++ ) {
			for(int j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("________________________");
	
			 
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
			
			System.out.println("________________________");
			for(int i=2;i<=100;i++) {
				boolean flag=true;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						flag=false;
						break;
					}
				}
				if(flag) {
					System.out.print(i+" ");
				}
				
			}
			 			
	}

}
