package com.epam.tasks.lesson4;

public class Task10
{
	public static void main(String[] args)
	{		
		int[] arr = new int[] {4, 5, 1, 7, -3, 6, 9, 1, 85, 0};
		
		System.out.println("Sourse array: ");
		for (int el : arr)
		{
			System.out.print(el + " ");
		}
		
		System.out.println("\nResult: ");
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] > i)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}
}
