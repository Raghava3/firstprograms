package com.pattern;

public class WPattern {

	public  static void main(String[] args)
	{
	for (int i = 0; i <5; i++)
	{
	
		for (int j = 0; j <=5; j++) 
		{
       if(j==0||j==4||(i==j&&j>2)||((i+j)==4&&j<3))
			{
            System.out.print("* ");	
			}
			else
			{
			System.out.print("  ");
			}
		}System.out.println(""); 
	
	}
	
}


}
