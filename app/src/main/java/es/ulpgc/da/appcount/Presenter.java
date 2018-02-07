package es.ulpgc.da.appcount;

/**
 * Created by antonioaren on 6/2/18.
 */

public class Presenter {
    private MainActivity view;
    private Model model;
    private int Valor = 0;


    public Presenter(MainActivity mainActivity) {
        this.view = mainActivity;
        model=new Model();
    }

    public void init(){
        model.setContador(Valor);
        view.setTextDisplay(""+model.getContador());
    }

    public void ButtonClickedAumentar(){
        Valor = model.Aumentar();
        view.setTextDisplay(""+Valor);
    }
}
