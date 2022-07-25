package abstractclass;

public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("meow meow!!!");
    }
}

class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("michi");
        cat.makeNoise();
    }
}