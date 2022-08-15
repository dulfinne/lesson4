package com.epam.tasks.lesson4;

public class Task2
{
	public static void main(String[] args)
	{		
		int[] arr = new int[] {0, 54, 34, 0, -33, 66, 0, 1, 85, 0};
		
		System.out.println("Sourse array: ");
		for (int el : arr)
		{
			System.out.print(el + " ");
		}
		
		int count = 0;
		for (int el : arr)
		{
			if(el == 0)
			{
				count++;
			}
		}

		int[] zeroArr = new int[count];
		
		for(int i = 0, j = 0; i < arr.length; i++)
		{
			if (arr[i] == 0)
			{
				zeroArr[j++] = i;
			}
		}
		
		System.out.println("\nIndexes of zero array: ");
		for (int el : zeroArr)
		{
			System.out.print(el + " ");
		}
	}
}
