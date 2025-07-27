class demo0418 {
    public static void main(String[] args) {
        System.out.println(4<<3);
    }
}

abstract class Animal{
    public abstract void makeSound();

    public void eat(){
        System.out.println("The animal is eating");
    }
}

class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("woof");
    }
}
class Test{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
    }
}