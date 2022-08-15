package com.epam.tasks.lesson4;

public class Task19
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {8, 6, 4, 2, 4, 3, 4, 8, 2, 8, 6, 5};
		int[] frequency = new int[arr.length];
		
		for(int el : arr)
		{
			System.out.print(el + " ");
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					frequency[i]++;
				}
			}
		}
		
		int res = 0;
		int resFrequency = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(resFrequency < frequency[i])
			{
				res = arr[i];
				resFrequency = frequency[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(resFrequency == frequency[i] && arr[i] < res)
			{
				res = arr[i];
			}
		}
		System.out.print("\nResult: " + res);
	}
}
