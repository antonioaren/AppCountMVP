package es.ulpgc.da.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.*;

public class MainActivity extends Activity {
    private TextView pantalla;
    private Button botonMas;
    private Button botonMenos;
    //private Presenter presenter;
    private Mediador mediador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Arrancando mi App");

       //presenter = new Presenter(this);
        mediador = new Mediador(this);


        pantalla = findViewById(R.id.textView);

        botonMas = findViewById(R.id.buttonMas);
        botonMenos = findViewById(R.id.buttonMenos);


        botonMas.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("MainActivity", "Boton Incrementar pulsado");
                mediador.getPresenter().buttonClickedAumentar();
            }
        });

        botonMenos.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity","Boton Decrementar pulsado");
                mediador.getPresenter().buttonClickedDecrementar();
            }
        });

        mediador.getPresenter().init();
    }

    public void setTextDisplay(String valor){
        pantalla.setText(valor);
    }


}
