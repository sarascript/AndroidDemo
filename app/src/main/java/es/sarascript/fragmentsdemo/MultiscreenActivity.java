package es.sarascript.fragmentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MultiscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiscreen);
    }
}


    // ---------------------------- MULTISCREEN DESIGN -------------------------------

        // Ponemos un texto y un color de fondo en el layout del .xml

        // En la carpeta layout pulsamos new - layout resource file. Le llamamos igual que el que ya tenemos
        // En los available qualifiers seleccionamos Orientation - Landscape