package ejercicions_evaluacion.problema2.solucion;

/**
 * Los objetos de esta clase representan sets de un partido de tenis. La
 * única información que gestionan es el nombre de los jugadores y el número
 * de juegos ganados en el set por cada jugador. En los métodos que siguen,
 * cuando los jugadores se identifican a través de datos enteros, uno de los
 * jugadores estará identificado con el entero «0» y el otro, con el entero
 * «1».
 */
public class Set {
    /**
     * Número mínimo de juegos que tiene que anotarse un jugador para poder
     * ganar el set.
     */
    private static final int MIN_NUM_JUEGOS = 6;
    /**
     * Diferencia mínima de juegos que tiene que haber entre los dos
     * jugadores para que uno de ellos pueda ganar el set.
     */
    private static final int MIN_DIF_JUEGOS = 2;
    /**
     * Nombres de los jugadores. En la componente indexada por 0, se
     * almacena el nombre del jugador identificado con el entero «0» y en la
     * componente indexada por 1, se almacena el nombre del jugador
     * identificado con el entero «1».
     */
    private String[] nombres;
    /**
     * Número de juegos ganados por los jugadores. En la componente indexada
     * por 0, se almacena el número de juegos ganados por el jugador
     * identificado con el entero «0» y en la componente indexada por 1, el
     * número de juegos ganados por el jugador identificado con el entero
     * «1».
     */
    private int[] juegos;
    /**
     * Pre: ---
     * Post: Ha inicializado los atributos de este objeto con los nombres de
     *       los dos jugadores y de forma que represente un set cuando comienza a jugarse.
     */
    public Set(String nombre0, String nombre1) {
        this.nombres = new String[] { nombre0, nombre1 }; this.juegos = new int[] { 0, 0 };
    }
    /**
     * Pre:  juegos0 >= 0 y juegos1 >= 0.
     * Post: Ha inicializado los atributos de este objeto para que represente un set en el
     *       que el jugador «0» se llama «nombre0» y tiene «juegos0» juegos ganados y el jugador
     *       «1» se llama «nombre1» y tiene «juebos1» juegos ganados.
     *
     */
    public Set(String nombre0, String nombre1, int juegos0, int juegos1) {
        this.nombres = new String[] { nombre0, nombre1 };
        this.juegos = new int[] { juegos0, juegos1 };
    }
    /**
     * Pre: jugador == 0 || jugador == 1
     * Post: Ha devuelto el número de juegos que lleva ganados el jugador
     *       identificado por el entero «jugador».
     */

    public int juegos(int jugador) {
        return this.juegos[jugador];
    }
    /**
     * Pre: jugador == 0 || jugador == 1
     * Post: Ha incrementado en una unidad el número de juegos ganados por
     *       el jugador identificado por el entero «jugador».
     */

    public void anotarJuego(int jugador) {
        this.juegos[jugador]++;
    }
    /**
     * Pre: jugador == 0 || jugador == 1
     * Post: Ha devuelto true si y solo si, en función de los juegos ganados
     *      por cada jugador, el jugador identificado por el entero
     *      «jugador» ha ganado este set.
     */
    public boolean haGanado(int jugador) {
        // Ha ganado si tiene 6 juegos o más y 2 juegos más que su rival
        return this.juegos[jugador] >= MIN_NUM_JUEGOS && this.juegos[jugador] - this.juegos[elOtro(jugador)] >= MIN_DIF_JUEGOS;
    }
    /**
     * Pre: jugador == 0 || jugador == 1
     * Post: Dado el jugador identificado por «jugador», ha devuelto el
     *       entero que identifica al otro jugador (1, si jugador==0 o 0, si jugador==1).
     */
    private int elOtro(int jugador) {
        return 1 - jugador;
    }
    /**
     * Pre: ---
     * Post: Ha devuelto true si y solo si, en función de los juegos ganados
     *       por cada jugador, este set ha terminado.
     */
    public boolean terminado() {
        return haGanado(0) || haGanado(1);
    }
    /**
     * Pre: ---
     * Post: Si este set ha terminado, ha devuelto el nombre del jugador que lo ha ganado.
     *       En caso de que el set no haya terminado, ha devuelto la cadena vacía.
     *
     */
    public String ganador() {
        if (haGanado(0)) {
            return this.nombres[0];
        } else if (haGanado(1)) {
            return this.nombres[1];
        } else {
            return "";
        }
    }
}
