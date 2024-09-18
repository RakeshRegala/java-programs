//import java.util.*;
class Vehicle{
    void start(){
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
        Car obj=new Car();
        v.start();
        obj.start();
    }
}
