Write a JAVA program to implement class mechanism. Create a class, methods and invoke 
them inside main method. 





import java.util.*;
class Student{
	String name;
	int rno;
	String branch;
	int marks(int a,int b){
		return a+b;
	}
	
	Student(String name,int rno,String branch){
		this.name=name;
		this.rno=rno;
		this.branch=branch;
	}
	
	void display(){
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rno);
		System.out.println("Branch: "+branch);
	}
}

	
class Methods{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	Student obj=new Student("Rakesh",33,"CSE");
	
	int x,y;
	System.out.println("Enter marks of 2 subjects: ");
	x=sc.nextInt();
	y=sc.nextInt();
	int r=obj.marks(x,y);
	System.out.println("Student Information: ");
	obj.display();
	System.out.println("Total marks: "+r);
	}
}
