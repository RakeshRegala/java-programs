import java.util.*;
public class calculator{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,b,c;

		System.out.print("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
		System.out.print("Enter your Choice:");
		c=sc.nextInt();
		
		switch(c)
		{
			case 1:System.out.println("addition is :"+(a+b));
				break;
			case 2:System.out.println("Substraction is :"+(a-b));
				break;
			case 3:System.out.println("Multiplication is :"+(a*b));
				break;
			case 4:System.out.println("Division is :"+(a/b));
				break;
			default:System.out.println("Enter valid choice");
		}
	}
}
