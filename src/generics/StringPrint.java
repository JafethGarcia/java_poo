package generics;

public class StringPrint {
    private String toPrint;

    public StringPrint(String toPrint) {
        this.toPrint = toPrint;
    }

    public void print() {
        System.out.println(this.toPrint);
    }
}
