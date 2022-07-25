package interfaceclass;

public interface AnimalStuff {
    int age = 0;
    String name = new String();
    void makeNoise();

    default int getAge() {
        log(age);
        return age;
    }

    default String getName() {
        log(name);
        return name;
    }

    private void log(Comparable n) {
        System.out.println("Returning: " + n);
    }
}