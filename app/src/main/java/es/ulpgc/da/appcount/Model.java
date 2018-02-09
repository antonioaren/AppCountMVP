package es.ulpgc.da.appcount;

/**
 * Created by antonioaren on 6/2/18.
 */

public class Model {
    private int contador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int aumentar() {
        return ++contador;
    }

    public int disminuir() {
        if (contador != 0) {
            return --contador;
        }else{
            return contador;
        }
    }
}
