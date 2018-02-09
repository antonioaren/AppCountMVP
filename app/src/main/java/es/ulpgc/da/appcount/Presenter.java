package es.ulpgc.da.appcount;

/**
 * Created by antonioaren on 6/2/18.
 */

public class Presenter {
    private MainActivity view;
    private Model model;
    private int Valor = 15; //Es el presentador quien indica en que valor se empieza.


    public Presenter(MainActivity mainActivity) {
        this.view = mainActivity;
        model=new Model();
    }

    public void init(){
        model.setContador(Valor);
        view.setTextDisplay(""+model.getContador());
    }

    public void ButtonClickedAumentar(){
        view.setTextDisplay(""+model.Aumentar());
    }

    public void ButtonClickedDecrementar() {
        view.setTextDisplay(""+model.Disminuir());
    }

}
