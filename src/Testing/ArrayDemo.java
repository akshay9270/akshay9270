package Testing;

import java.util.Iterator;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int arr[][]= {{10,20,30}, {40,50,60}, {70,80,90}};
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[0][i];
		}
		System.out.println(sum);
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			sum1+=arr[i][0];
		}
		System.out.println(sum1);

	}
}
