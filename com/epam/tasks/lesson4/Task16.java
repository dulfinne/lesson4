package com.epam.tasks.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Task16
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
		
		double max = -10000;
		for(int i = 0; i < arr.length / 2; i++)
		{
			max = Math.max(max, arr[i] + arr[arr.length - 1 - i]);
		}
		
		System.out.printf("\nResult: %.2f", max);
	}
}
