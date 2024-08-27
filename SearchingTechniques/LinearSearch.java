import java.util.*;

class search{
    int i;
    int Searching(int a[],int key,int n){
        for(i=0;i<n;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
}

public class LinearSearch{
    public static void main(String[] args){
        search obj=new search();                                        //creating an object
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the Key:");
        int key=sc.nextInt();
        int r=obj.Searching(a, key, n);
        if(r == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key is found at index:"+r);
        }
    }
}
