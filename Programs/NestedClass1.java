class Outerclass{
    static class StaticNestedClass{
        void display(){
            System.out.println("Method in StaticNestedClass is Executed");
        }   
    }
    class InnerClass{
        void display(){
            System.out.println("Method in  Non-staticInnerClass");
        }
    }
    void outerMethod(){
        StaticNestedClass inner1=new StaticNestedClass();
        inner1.display();
        
        InnerClass inner2=new InnerClass();
        inner2.display();
    } 
    public static void main(String[] args){
        Outerclass outer=new Outerclass();
        outer.outerMethod();
    }

}
