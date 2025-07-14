package Testing;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
//		//Program 1
//		int i=0;
//		int []arr= {10,30,70,10,20,90};
//		Arrays.sort(arr);
//		System.out.print("Array Element Increment approch using while loop :");
//		while(i<=arr.length-1){
//			System.out.print(arr[i]+" ");
//			i++;
//		}
//		//Program 2
//		System.out.println();
//		int j=arr.length-1;
//		System.out.print("Array Element Reve approch using while loop :");
//		while(j>=0)
//		{
//			System.out.print(arr[j]+" ");
//			j--;
//		}
//		//Program 3
//		System.out.println();
//		int l=0;
//		int count=0;
//		while(l<=arr.length-1)
//		{
//			if(arr[l]==10)
//			{
//				count=count+1;
//			}
//			l++;
//		}
//		System.out.println("Occurance of element 10 :"+count);
		
		//Program 4
		System.out.print("Array Element Increment approch using Do-while loop :");
		int []arr= {10,30,70,10,20,90};
		Arrays.sort(arr);
		int i=0;
		do {
			System.out.print(arr[i]+" ");
			i++;
		} while (i<arr.length);
		
		//program 5
		System.out.println();
		System.out.print("Array Element Reverse   approch using Do-while loop :");
		int j=arr.length-1;
		do {
			System.out.print(arr[j]+" ");
			j--;
		} while (j>=0);
		
		//program 6
		System.out.println();
		int count=0;
		int l=0;
		do {
			if(arr[l]==10)
			{
				count+=1;
			}
			l++;
		} while (l<arr.length);
		System.out.println("Occurance of element 10 is :"+count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
