
class Animal {
    public void walk(){
        System.out.println("Animal is walking");
    }
}

class Dog extends Animal{
    public void walk(){
        System.out.println("Dog is walking");
    }
}


public class HelloWorld {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.walk();
    }
}