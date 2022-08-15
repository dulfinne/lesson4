package com.epam.tasks.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Task11
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Enter the length of array: ");
		int n = Integer.parseInt(scan.nextLine());
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = rand.nextInt(100);
		}
		
		for (int el : arr)
		{
			System.out.print(el + " ");
		}
		
		System.out.print("\nm = ");
		int m = Integer.parseInt(scan.nextLine());
				
		for(int el : arr)
		{
			if (el % m > 0 && el % m < m-1)
			{
				System.out.print(el + " ");
			}
		}		
	}
}
