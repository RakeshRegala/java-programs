//Write a JAVA program for abstract class to find areas of different shapes

abstract class shapes {
    abstract double area(); // Abstract method
}

class Rectangle extends shapes {
    double length;
    double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length*width;
    }
}


class Circle extends shapes {
    private double pi=3.14;
    private double r=10.0;
    double area() {
        return pi*r*r;
    }
}

public class hell {
    public static void main(String[] args) {
        shapes rect = new Rectangle(30,40); 
        Circle cir= new Circle(); 

        System.out.println(rect.area()); 
      System.out.println(cir.area());
    }
}
