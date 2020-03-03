/*Write an Java Program to find product of Prime Numbers From 50 to 500.*/
//hello...................................................................

import java.util.*;
class Exam1
{
	public static void main(String[] args)
	{
		int i,count,j,pro=1;
		for(i=50;i<=500;i++)
		{	
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				pro*=i;
				//System.out.print("|"+i);
			}
		}
		System.out.println("the product of prime numbers from 50 to 500 is:"+pro);
	}
}