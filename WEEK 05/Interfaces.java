//Write a JAVA program to implement Interface.


interface Vehicle{
    void start();
    void stop();
}


interface milage{
    void milage();
}


class Bike implements Vehicle,milage{
    @Override
    public void start(){        //public is must
        System.out.println("Bike is starting");
    }
    
    public void stop(){
                System.out.println("Bike is stoping");

    }
    public void milage(){
        System.out.println("Bike milage is 50Km");
    }
}

public class interfaces{
    public static void main(String[] args){
        Bike b=new Bike();
        b.start();
        b.milage();
        b.stop();
        
    }
}
