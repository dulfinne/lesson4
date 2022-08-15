package com.epam.tasks.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Task3
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
		
		System.out.println();
		
		for(int el : arr)
		{
			if (el < 0)
			{
				System.out.println("Negative occurs first");
				break;
			}
			else if (el > 0)
			{
				System.out.println("Pozitive occurs first");
				break;
			}
		}
		
	}
}
