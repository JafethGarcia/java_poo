package interfaceclass;

public class Cat implements AnimalStuff {
    @Override
    public void makeNoise() {
    }
}

class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.getName();
    }
}
