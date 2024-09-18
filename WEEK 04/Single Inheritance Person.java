//import java.util.*;
class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Name is:"+name); 
        System.err.println("Age is:"+age);
    }
}

class Employee extends Person{
    double salary;

    Employee(String name,int age,double salary){
        super(name,age);                                                                                             // this.name=name;
                                                                                                                    // this.age=age;
        this.salary=salary;
    }
  //  @Override
    void display(){
        System.out.println("Name is: "+name); 
        System.err.println("Age is: "+age);
        System.out.println("Salary is: "+salary);

    }
}

public class inheritance{
    public static void main(String[] args){
        Employee obj=new Employee("Rakesh",23,2000000);

        obj.display();
    }
}
