package com.epam.tasks.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Task17
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Enter the length of array: ");
		int n = Integer.parseInt(scan.nextLine());
		
		double[] arr = new double[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = rand.nextInt(200) * 0.1 - 10;
		}
		
		for (double el : arr)
		{
			System.out.printf("%.1f ", el);
		}
		
		double min = 10000;
		for(int i = 0; i < arr.length; i++)
		{
			min = Math.min(min, arr[i]);
		}
		
		int count = 0;
		for(double el : arr)
		{
			if(el == min)
			{
				count++;
			}
		}
		
		double[] result = new double[arr.length - count];
		for(int i = 0, j = 0; i < arr.length; i++)
		{
			if(arr[i] != min)
			{
				result[j++] = arr[i];
			}
		}
		
		System.out.println("\nResult: ");
		for (double el : result)
		{
			System.out.printf("%.1f ", el);
		}
 	}
}
