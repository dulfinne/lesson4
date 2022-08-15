package com.epam.tasks.lesson4;

public class Task5
{
	public static void main(String[] args)
	{		
		int[] arr = new int[] {35, 54, 341, 949, -33, 66, 0, 1, 85, 11};
		
		System.out.println("Sourse array: ");
		for (int el : arr)
		{
			System.out.print(el + " ");
		}
		
		int evenCount = 0;
		for (int el : arr)
		{
			if(el % 2 == 0)
			{
				evenCount++;
			}
		}
		
		if (evenCount == 0)
		{
			System.out.println("\nThere are no even numbers in array.");
		}
		else
		{
			int[] evenArr = new int[evenCount];
			
			for(int i = 0, j = 0; i < arr.length; i++)
			{
				if (arr[i] % 2 == 0)
				{
					evenArr[j++] = arr[i];
				}
			}
			
			System.out.println("\nEven numbers array: ");
			for (int el : evenArr)
			{
				System.out.print(el + " ");
			}
		}
	}
}
