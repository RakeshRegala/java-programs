import java.util.*;
class Handling{
	void divide(int a,int b){
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println(e.toString());
			System.out.println("Error! Division by Zero is not allowed");
		}
		finally{
			System.out.println("Division is completed");
		}
}
}

public class exception{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter Two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		Handling obj=new Handling();

		obj.divide(a,b);
	}
}


