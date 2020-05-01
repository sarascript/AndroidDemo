package es.sarascript.fragmentsdemo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import es.sarascript.fragmentsdemo.Fragments.FirstFragment;
import es.sarascript.fragmentsdemo.Fragments.SecondFragment;

import android.view.View;

public class DinamicFragmentsActivity extends AppCompatActivity {

    boolean cargarSecondFragment = true;


    // ---------------------------- BASIC ACTIVITY -------------------------------

        // Para añadir contenido al .xml hay que hacerlo en el content_dinamic_fragments.xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinamic_fragments);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Código del botón flotante

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment f = null;

                // Usamos un if para alternar entre los dos fragments al pulsar el botón

                if (cargarSecondFragment) {
                    f = new SecondFragment();
                } else {
                    f = new FirstFragment();
                }

                // Modificar el fragment cargado en el contenedor

                getSupportFragmentManager().beginTransaction().replace(R.id.container, f).commit(); // Usamos .replace en lugar de .add

                cargarSecondFragment = !cargarSecondFragment;

            }
        });


    // ---------------------------- DINAMIC FRAGMENT -------------------------------

        // Cambiamos el layout del .xml por un FrameLayout y le damos un id

        // Referenciamos el contenedor y le cargamos un fragment

        getSupportFragmentManager().beginTransaction().add(R.id.container, new FirstFragment()).commit();

        // Para modificar el fragment cargado en el contenedor:

        // Añadir al onClick del botón -> getSupportFragmentManager().beginTransaction().replace(R.id.container, new SecondFragment()).commit();

    }

}




