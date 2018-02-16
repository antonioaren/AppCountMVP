package es.ulpgc.da.appcount;

import android.app.Application;

/**
 * Created by antonioaren on 9/2/18.
 */

public class Mediador extends Application{
    private Presenter presenter;
    private Model model;
    private MainActivity view;

    public Mediador() {

    }

    public Presenter getPresenter() {
        if (presenter == null){
            presenter = new Presenter(this);
        }
        return presenter;
    }

    public Model getModel() {
        if (model == null){
            model = new Model();
        }
        return model;
    }

    public void setView(MainActivity view) {
        this.view = view;
    }

    public MainActivity getView() {
        return view;
    }

}
