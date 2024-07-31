import java.util.*;
public class search{
	public static int BinarySearch(int a[],int key,int n){
	int low=0,high=n;
	int mid;
	while(low<=high)
	{
		mid=(low+high)/2;
		if(key==a[mid])
			return mid;
		else if(key<a[mid])
			high=mid-1;
		else
			low=mid+1;
	}
	return -1;
	}
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number of elements: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the elements: ");
	for(int i=0;i<n;i++){
	a[i]=sc.nextInt();
	}
	System.out.println("Enter Key: ");
	int key=sc.nextInt();
	int p=BinarySearch(a,key,n);
	if(p==-1)
		System.out.println("Key not found");
	else
		System.out.println("Key found at index:"+p);
	
}
}
