package com.training.corejava;

public class Controls {

	public static void main(String[] args)
	{
		int roi=3;
		double principal = 10000;
		// If
		if(roi>1 && principal >=50000)
		{
			System.out.println("The interest is :" + (roi*principal /100));
		}// if else
		else {
			System.out.println("interest cannot be calculated");
		}
		// While
		int no =1;
		int sum=0;
		while(no<=10){
			sum = sum+no;
			no++;
		
		}
		System.out.println("The sum of : " + sum);
		
		// Do While
		int[] value = {10,60,50,80,74,96,36};
		int avg;
		sum =0;
		int i = 0;
		do{
			sum= sum + value[i];
			i++;
					
		} while ( i < value.length);
		
		System.out.println("The avg is : " + sum/value.length ); 
		
		//FOR loop
		int start = 10;
		int end = 1;
		// for( declaration(1);Condition(*);incdec(*)) which executes only once.
		for(int j = start; j>=end; j--)
		{
			 System.out.print(" ,j is " + j);
		}
		
		//for each
		sum=0;
		for (int v : value)
		{
			sum = sum +v;
					}
		
		System.out.println("The avg is : " + sum/value.length);
		
		//Switch
		char status = 's';
		switch(status){
		case's':
			System.out.println(" the product is shipped");
			break;
		case'N':
			System.out.println("The product is not shipped");
			break;
		default:
			System.out.println("Unknown shipping status");
			
		}
		 
	}
}
