package arrays;

import java.util.Arrays;

public class arrayss
{
	public static void main(String[] args) 
	{
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {20,30,10,50,40};
		int arr3[]=new int[20];
		int k=0;
		for(int i=0;i<arr1.length;i++)
		{	
			for(int j=0;j<arr2.length;j++)
			{	
			if(arr1[i]==arr2[j])
			{
				arr3[k++]=arr1[i];
			}
			}
			
			
		}
		int flag=0;
		for(int i=0;i<arr1.length;i++)
		{
		if(arr1[i]==arr3[i])
		{
			flag=0;
		}
		flag=1;
		}
		if(flag!=0)
		{
			System.out.println("diff");
		}
		
	}

}
