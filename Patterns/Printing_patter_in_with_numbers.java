//Printing this pattern

/* 1
   2 3
   4 5 6
   7 8 9 10
   11 ........
   */


import java.util.*;
public class pattern
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter number of rows: ");
	n=sc.nextInt();
	int k=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
	}
}
}
