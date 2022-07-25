package ejercicions_evaluacion.problema1.solucion;

public class Repituno {
    /**
     * Pre: n>0
     * Post: Si «n» es un número repituno, ha devuelto el orden del mismo. En caso contrario, ha devuelto -1.
     */
    public static int ordenRepituno(int n) {
        int numCifras = 0;
        boolean esRepituno = true;
        while (n != 0 && esRepituno) {
            int ultimoDigito = n % 10;
            n = n / 10;
            numCifras++;
            esRepituno = (ultimoDigito == 1);
        }
        // n == 0 || !esRepituno
        if (esRepituno) {
            return numCifras;
        } else {
            return -1;
        }
    }
}