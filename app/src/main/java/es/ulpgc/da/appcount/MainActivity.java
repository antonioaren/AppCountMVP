package es.ulpgc.da.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView pantalla;
    private Button boton1;
    private Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Arrancando mi App");

        presenter = new Presenter(this);
        pantalla = findViewById(R.id.textView);
        boton1 = findViewById(R.id.button);


        boton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("MainActivity", "boton pulsado");
                presenter.ButtonClickedAumentar();
            }
        });

        presenter.init();
    }

    public void setTextDisplay(String valor){
        pantalla.setText(valor);
    }


}
