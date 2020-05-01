package es.sarascript.fragmentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MultiscreenTabletActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiscreen_tablet);

    // ---------------------------- MULTISCREEN DESIGN -------------------------------

        // Creamos dos fragments y añadimos el mobile fragment al .xml del activity

        // En la carpeta layout pulsamos new - layout resource file. Le llamamos igual que el que ya tenemos y ponemos un FrameLayout
        // En los available qualifiers seleccionamos Smallest screen width - 600dp

        // Para saber si hemos cargado la app desde una Tablet referenciamos el id del layout Smallest screen width - 600dp

        LinearLayout layoutContainer = (LinearLayout) findViewById(R.id.tabletContainer);

        if (layoutContainer != null) {
            // Tablet
        } else {
            // Mobile
        }

        // Añadimos los dos fragments al layout Smallest screen width - 600dp

    }
}

