package ejercicions_evaluacion.problema6;

public class MyClass {
    public static void main(String[] args) {
        int[] enteros = new int[]{6, 2, -1, 3, 5, 0, 10, 6};
        MySort s1 = new MySort(enteros);
        System.out.println("Result:" + s1);
        // Result: [-1,0,2,3,5,6,6,10]
    }
}
