package com.epam.tasks.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Task6
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
			arr[i] = rand.nextInt(100) - 50;
		}
		
		for (int el : arr)
		{
			System.out.print(el + " ");
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++)
		{
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		
		System.out.println("\nResult: " + (max - min));
	}
}
