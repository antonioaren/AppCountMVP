package es.ulpgc.da.appcount;

/**
 * Created by antonioaren on 6/2/18.
 */

public class Presenter {
    private Mediador mediador;
    private int Valor = 0; //Es el presentador quien indica en que valor se empieza.

    //protected final String TAG = this.getClass().getSimpleName();
    //Lo que hace es que te pone el valor del TAG automáticamente.

    public Presenter() {
        mediador = new Mediador();
    }

    public void init(){
        mediador.getModel().setContador(Valor);
        mediador.getView().setTextDisplay(""+mediador.getModel().getContador());
    }

    public void buttonClickedAumentar(){
        mediador.getView().setTextDisplay(""+mediador.getModel().aumentar());
    }

    public void buttonClickedDecrementar() {
        mediador.getView().setTextDisplay(""+mediador.getModel().disminuir());
    }

}
