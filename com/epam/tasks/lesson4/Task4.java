package com.epam.tasks.lesson4;

public class Task4
{
	public static void main(String[] args)
	{		
		double[] arr = new double[] { -3.23, 2.4, 3.04, 8, 44.1};
		
		System.out.println("Sourse array: ");
		for (double el : arr)
		{
			System.out.print(el + " ");
		}
		
		boolean isIncreasing = true;
		for(int i = 0; i < arr.length - 1; i++)
		{
			if (arr[i] > arr[i + 1])
			{
				isIncreasing = false;
				break;
			}
		}
		System.out.println("\nIs array increasing? " + isIncreasing);
	}
}
