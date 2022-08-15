package com.epam.tasks.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Task13
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Enter the length of array: ");
		int k = Integer.parseInt(scan.nextLine());
		
		int[] arr = new int[k];
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
		System.out.print("l = ");
		int l = Integer.parseInt(scan.nextLine());
		System.out.print("n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		int count = 0;
		
		for(int el : arr)
		{
			if (el % m == 0 && el > l && el < n)
			{
				count++;
			}
		}
		System.out.println("Result: " + count);
		
	}
}
