//import java.util.*;
class Vehicle{
    void start1(){
        System.out.println("Vechicle Started"); 
    }
}

class Car extends Vehicle{
  //  @Override
    void start(){
        System.out.println("Car Started"); 

    }
}

public class inheritance{
    public static void main(String[] args){
        Vehicle v=new Vehicle();
        Car c=new Car();
        v.start();
        c.start1();
    }
}
