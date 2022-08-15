package com.epam.tasks.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Task8
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
			arr[i] = rand.nextInt(2000) * 0.1 - 100;
		}
		
		System.out.println("Sourse array: ");
		for (double el : arr)
		{
			System.out.printf("%.3f ", el);
		}
		
		int pos = 0;
		int neg = 0;
		int zero = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > 0)
			{
				pos++;
			}
			else if(arr[i] < 0)
			{
				neg++;
			}
			else 
			{
				zero++;
			}
		}
		
		System.out.printf("\npozitive: %d\nnegative: %d\nzero: %d", pos, neg, zero);
	}
}
