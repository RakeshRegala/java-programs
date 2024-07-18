import java.util.Scanner;

public class quadratic_eq_discriminate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coefficient a:");      
        double a=sc.nextDouble();
        System.out.println("Enter coefficient b:");                 //Input the coeffiient's
        double b=sc.nextDouble();
        System.out.println("Enter coefficient c:");
        double c=sc.nextDouble();
        double d=((b*b) - 4*(a*c));                                //finding the discriminate value
        
        
        if(d>0){
            System.out.println("The eq has two distinct real root:");
            double root1=(-b + Math.sqrt(d))/(2*(a));
            double root2=(-b - Math.sqrt(d))/(2*(a));
            System.out.println("Root1:"+root1+" "+ "Root2:"+root2);
        }
        
        else if(d==0){
            System.out.println("The eq has equal roots:");
            double root=(-b )/(2*(a));
            System.out.println("Root:   "+root);
        }
        
        else{
            System.out.println("The eq has two complex roots:");
            double real=-b/(2*a);
            double imaginary=Math.sqrt(-d)/(2*a);
            System.out.println("Root1:"+real+" + "+imaginary+"i");
            System.out.println("Root2:"+real+" - "+imaginary+"i");
        }
    }
}
