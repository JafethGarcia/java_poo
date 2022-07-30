package ejercicions_evaluacion.problema6;

public class MySort {
    private int[] ordenados;
    public MySort(int[] enteros) {
        ordenados = enteros.clone();
        ordenar();
    }

    private void ordenar() {
        int primero = 0;
        int i = 1;
        while (i < ordenados.length) {
            if (ordenados[primero] > ordenados[i]) {
                int a = ordenados[primero];
                int b = ordenados[i];
                ordenados[primero] = b;
                ordenados[i] = a;
                primero = 0;
                i = 1;
            } else {
                primero++;
                i++;
            }
        }
    }

    public String toString() {
        String resultado = " [";
        for (int i=0; i < ordenados.length; i++) {
            if (resultado == " [") {
                resultado += ordenados[i];
            } else {
                resultado += "," + ordenados[i];
            }
        }
        return resultado + "]";
    }
}
