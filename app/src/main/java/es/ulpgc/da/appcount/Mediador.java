package es.ulpgc.da.appcount;

/**
 * Created by antonioaren on 9/2/18.
 */

public class Mediador {
    private Presenter presenter;
    private Model model;
    private MainActivity view;

    public Mediador() {
    }

    public Mediador(MainActivity mainActivity) {
        this.view = mainActivity;
    }

    public Presenter getPresenter() {
        if (presenter == null){
            presenter = new Presenter();
        }
        return presenter;
    }

    public Model getModel() {
        if (model == null){
            model = new Model();
        }
        return model;
    }

    public MainActivity getView() {
        return view;
    }

    public void setView(MainActivity view) {
        this.view = view;
    }
}
