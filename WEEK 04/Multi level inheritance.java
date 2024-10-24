class Animal{
    void makeSound(){

    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("My Dog is barking");
    }
}

class Puppy extends Dog{
    void weep(){
        System.out.println("puppy is weeping");
    }
}


class Multilevel{
    public static void main(String[] args){
     
        Puppy p=new Puppy();
        p.makeSound();
        p.bark();
        p.weep();

    }
}
