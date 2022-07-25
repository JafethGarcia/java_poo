package generics;

public class Main {
    public static void main(String[] args) {
        StringPrint sp = new StringPrint("print this");
        sp.print();
        IntegerPrint ip = new IntegerPrint(23);
        ip.print();
        DoublePrint dp = new DoublePrint(23.3);
        dp.print();
        // now with generic
        Printer<String> gsp = new Printer<>("with generic");
        gsp.print();
        Printer<Integer> gip = new Printer<>(666);
        gip.print();
        Printer<Double> gdp = new Printer<>(15.25);
        gdp.print();
    }
}
