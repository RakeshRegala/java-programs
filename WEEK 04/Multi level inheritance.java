class Animal{
    void makeSound(){

    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("I am a dog");
    }
}

class Puppy extends Dog{
    void makeSound(){
        System.out.println("I am a puppy");
    }
}


class Multilevel{
    public static void main(String[] args){
        Animal a=new Animal();
        Dog d=new Dog();
        Puppy p=new Puppy();
        a.makeSound();
        d.makeSound();
        p.makeSound();

    }
}
