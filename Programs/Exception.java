public class exception {
    public static void main(String[] args){
        method1();
    }
    public static void method1(){
        int a=1,b=0;int r=0;
        System.out.println("Program started");
        try{
        r=a/b;
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
            
        }
        finally{
            System.out.println("Finally Block");
        }
        System.out.println("sum is:"+r);
        System.out.println("Program ended");
    }
}
