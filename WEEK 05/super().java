import java.util.*;

class Animal{
    String name;
    Animal(){
        
        System.out.println("Animal constructor is called");
    }
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog constructor is called");
    }
    void Sound(){
        super.sound();
        System.out.println("Dog makes sound");
    }
}

public class hello{
    public static void main(String[] args){
        Dog in=new Dog();
        in.Sound();
    }
}
