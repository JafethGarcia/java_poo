package generics;

public class Printer<T> {
    private T toPrint;

    public Printer(T toPrint) {
        this.toPrint = toPrint;
    }

    public void print() {
        System.out.println(this.toPrint);
    }
}
