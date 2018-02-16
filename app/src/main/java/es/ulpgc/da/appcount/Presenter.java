package es.ulpgc.da.appcount;

/**
 * Created by antonioaren on 6/2/18.
 */

public class Presenter {
    private Mediador mediador;
    //protected final String TAG = this.getClass().getSimpleName();
    //Lo que hace es que te pone el valor del TAG automáticamente.

    public Presenter(Mediador mediador) {
        this.mediador = mediador;
    }

    public void init(){
       mediador.getView().setTextDisplay(""+mediador.getModel().getContador());
    }

    public void buttonClickedAumentar(){
        int contador = mediador.getModel().aumentar();
        mediador.getView().setTextDisplay(""+contador);
    }

    public void buttonClickedDecrementar() {
        int contador = mediador.getModel().disminuir();
        mediador.getView().setTextDisplay(""+contador);
    }

}
