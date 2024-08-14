class overload{
	int pp,java,dbms;
	String name;
    public overload(String name,int pp,int java,int dbms){
		this.name=name;
		this.java=java;
		this.pp=pp;
		this.dbms=dbms;
	}
	
	public overload(){
		this.name="Unknown";
		this.java=0;
		this.pp=0;
		this.dbms=0;
	}
	
	public void display(){
		System.out.println(name);
		System.out.println(pp);
		System.out.println(java);
		System.out.println(dbms);
	}
		
}

public class ConstructorOverloading{
	public static void main(String[] args){
	overload one=new overload();
	overload two=new overload("Rakesh",99,89,98);
	System.out.println("Details of 1st Students");
	one.display();
	System.out.println("Details of 1st Students");
	two.display();
	}
}
