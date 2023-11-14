package com.cg.assignments;

public class fibbonacci_Series {
	public static void main(String[] args) {
		
		    
		 int x=11,
			y=12,
			 z,i,
			count=5;    
		 System.out.print(x+" "+y);    
		    
		 for(i=2;i<count;++i)    
		 {    
		  z=x+y;    
		  System.out.print(" "+z);    
		  x=y;    
		  y=z;    
		 } 
 
	}
 

}
