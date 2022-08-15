package com.epam.tasks.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Task20
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
		
		for(int el : arr)
		{
			System.out.print(el + " ");
		}
		
		System.out.println();
		
		for(int i = 1; i < arr.length; i++)
		{
			arr[i] = 0;
			for(int j = i; j < arr.length - 1; j++)
			{
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		
		System.out.println("Result: ");
		for(int el : arr)
		{
			System.out.print(el + " ");
		}
	}
}
