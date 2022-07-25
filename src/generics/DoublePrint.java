package generics;

public class DoublePrint {
    private double toPrint;

    public DoublePrint(double toPrint) {
        this.toPrint = toPrint;
    }

    public void print() {
        System.out.println(this.toPrint);
    }
}
