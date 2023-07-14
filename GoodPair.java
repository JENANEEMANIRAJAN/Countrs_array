package prograd;

import java.util.Scanner;
class Arr {
	public static int verify(int A[])
	{
		Scanner sc = new Scanner(System.in);
		int size = A.length;
		int B = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(A[i]+A[j]==B)
				{
					return 1;
				}
				
			}
				
		}
		return 0;
	}
}
public class GoodPair{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Arr Array = new Arr();
		int pair = Arr.verify(arr);
		System.out.println("Count Number:"+pair);
	}

}
