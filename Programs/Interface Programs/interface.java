// Online Java Compiler
// Use this editor to write, compile and run your Java code online
interface animal {
    public void makesound();
    public void eat();
}

class dog implements animal{
    public void makesound(){
        System.out.println("Dog makesound");
    }
    public void eat(){
        System.out.println("Dog eat");
    }
}

class cat implements animal{
    public void makesound(){
        System.out.println("cat makesound");
    }
    public void eat(){
        System.out.println("cat eat");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
       animal d=new dog();
       animal c=new cat();
       d.makesound();
       d.eat();
       c.makesound();
       c.eat();
       
    }
}
