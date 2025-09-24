class Animal {
    public Animal() {}

    public void eat() {
        System.out.println("eating....");
    }
}

class Dog extends Animal {
    public Dog() {}
        public void bark() {
            System.out.println("barking....");
        }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog ();
        d.eat();
    }
}