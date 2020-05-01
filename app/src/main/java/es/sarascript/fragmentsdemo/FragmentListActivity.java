package es.sarascript.fragmentsdemo;

import androidx.appcompat.app.AppCompatActivity;
import es.sarascript.fragmentsdemo.Fragments.FirstFragment;
import es.sarascript.fragmentsdemo.Fragments.ItemFragment;

import android.os.Bundle;

public class FragmentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_list);


        // ---------------------------- DINAMIC FRAGMENT -------------------------------

        // Creamos un Fragment (List)

        // Cambiamos el layout del .xml de la activity a FrameLayout y le damos un id

        // Referenciamos el contenedor y le cargamos el fragment del Item

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.contenedor, ItemFragment.newInstance(1)) // En el caso de una lista, usamos el método .newInstance(), el cuál nos pide el número de columnas a mostrar
                .commit();

        // Comentar los métodos onAttach() y onDetach() del ItemFragment.java

    }
}



