
import java.util.Arrays;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       int a[]=new int[]{1,6,8,90};
       System.out.print("Enter key: ");
       int key=sc.nextInt();
     int r= Arrays.binarySearch(a,key);
    if(key == a[r])
       System.out.print("key is found at"+r);
      else
      System.out.print("Key not found");
    }
}