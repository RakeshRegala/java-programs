c) Write a JAVA program that implements Runtime polymorphism 


class Subjects{
    void topic(){
        System.out.println("Subjects are 10");
    }
}

class DBMS extends Subjects{
    @Override
    void topic(){
        System.out.println("DBMS has 5 units");
    }
}

class JAVA extends Subjects{
    void topic(){
        System.out.println("JAVA has 5 units");
    }
}





public class polymorphism {
    public static void main(String[] args){
        Subjects d=new DBMS();
        d.topic();
        Subjects j=new JAVA();
        j.topic();
    }
}
