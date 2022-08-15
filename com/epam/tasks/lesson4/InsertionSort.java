package com.epam.tasks.lesson4;

import java.util.Scanner;
import java.util.Random;

public class InsertionSort
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
			arr[i] = rand.nextInt(1000) - 500;
		}
		
		for(int el : arr)
		{
			System.out.print(el + " ");
		}
		
		for (int i = 1; i < arr.length; i++)
		{	
			for (int j = i; j > 0; j--)
			{
				if(arr[j]<arr[j-1])
				{
					int temp2 =arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp2;
				}
				else
				{
					break;
				}
			}
		}
		
		System.out.println("\nResult: ");
		for(int el : arr)
		{
			System.out.print(el + " ");
		}
	}
}
