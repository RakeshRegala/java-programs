/* Printing an isoceles triangle
	   *
	  * *
	* * * *
      */

import java.util.*;
public class triangle{
	public static void main(String args[]){
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)+1;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}	
