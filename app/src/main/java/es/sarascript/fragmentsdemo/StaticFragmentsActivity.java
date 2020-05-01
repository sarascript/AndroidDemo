package es.sarascript.fragmentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StaticFragmentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_fragments);
    }
}


    // ---------------------------- FRAGMENTS -------------------------------

        // Para cargar un fragment en un activity arrastramos un componente fragment al .xml de la activity desde la vista de diseño y elegimos el fragment que queramos.

