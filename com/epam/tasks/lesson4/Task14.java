package com.epam.tasks.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Task14
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
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int i = 1; i < arr.length; i++)
		{
			if (i % 2 == 0)
			{
				max = Math.max(max, arr[i]);
			}
			else
			{
				min = Math.min(min, arr[i]);
			}
		}
		
		System.out.println("\nResult: " + (max + min));
	}
}
