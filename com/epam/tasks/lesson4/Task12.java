package com.epam.tasks.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task12
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
			System.out.printf("%.3f ", el);
		}
		
		double sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(isPrime(i))
			{
				sum += arr[i];
			}
		}
		
		System.out.printf("\nResult: %.3f", sum);
	}
	
	public static boolean isPrime(int x)
	{
		if (x <= 0)
		{
			return false;
		}
		for (int i = 2; i < x; i++)
		{
			if (x % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}

