package com.epam.tasks.lesson4;

public class Task18
{
	public static void main(String[] args)
	{
		int[] pass = new int[10];
		pass[0] = 4;
		pass[1] = 5;
		
		for(int i = 2; i < pass.length; i++)
		{
			pass[i] = 10 - pass[i - 1] - pass[i - 2];
		}
		
		System.out.println("Password is:");
		for(int el : pass)
		{
			System.out.print(el + " ");
		}
	}
}
