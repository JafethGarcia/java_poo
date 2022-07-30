package ejercicions_evaluacion.problema5;

public class Main {
    public static void main(String[] args) {
        System.out.println(generarCadena(10, 22));
        System.out.println(generarCadena(5, 3));
        System.out.println(generarCadena(3, 3));
        System.out.println(generarCadena(1, 4));
    }

    public static String generarCadena(int x, int y) {
        String resultado = "";
        int diferencia = Math.abs(x - y);
        int mayor;
        int menor;
        String cadenaMayor;
        String cadenaMenor;
        if (x > y) {
            mayor = x;
            cadenaMayor = "x";
            menor = y;
            cadenaMenor = "y";
        } else {
            mayor = y;
            cadenaMayor = "y";
            menor = x;
            cadenaMenor = "x";
        }
        int dobleMenor = menor * 2 + 2;
        if (mayor > dobleMenor) {
            return "Oopss no puedo evitar poner 3 elementos de [" + cadenaMayor + "] me sobran " + (mayor - dobleMenor) + " caracteres.";
        }
        while (mayor > 0 || menor > 0) {
            if (mayor >= 2 && diferencia > 0) {
                mayor = mayor - 2;
                resultado = resultado + repetir(2, cadenaMayor);
            } else if (mayor > 0) {
                mayor = mayor - 1;
                resultado = resultado + repetir(1, cadenaMayor);
            }
            if (menor > 0) {
                menor = menor - 1;
                resultado = resultado + repetir(1, cadenaMenor);
            }
        }

        return resultado;
    }

    private static String repetir(int max, String cadena) {
        String resultado = "";
        for(int i = 0; i < max; i++) {
            resultado = resultado + cadena;
        }
        return resultado;
    }
}
