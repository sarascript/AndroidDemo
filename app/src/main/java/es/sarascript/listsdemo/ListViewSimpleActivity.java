package es.sarascript.listsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewSimpleActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listaView;
    private List<String> simpleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_simple);


    // ---------------------------- LIST VIEW SIMPLE -------------------------------

        // Creamos un elemento ListView en el .xml, le ponemos un id y los constraints en vista diseño

        // Declaramos una variable y le asignamos el ListView -> private ListView lista;

        listaView = (ListView) findViewById(R.id.listViewSimple);

        // Para rellenar la lista creamos un objeto lista de strings -> private List<String> simpleList;

        simpleList = new ArrayList<>();
        simpleList.add("Mochi");
        simpleList.add("Hamtaro");
        simpleList.add("Mew");
        //...

        // Para unir la lista con el ListView necesitamos utilizar un adapter

        ArrayAdapter<String> adapterSimpleList = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1, // Layout necesario para indicar cómo dibujar la lista
                simpleList // listado de elementos
                );

        listaView.setAdapter(adapterSimpleList);

        // Para gestionar los eventos click sobre cada elemento del ListView

        listaView.setOnItemClickListener(this); // Debemos implementar la interfaz -> implements AdapterView.OnItemClickListener

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) { // Posición del elemento clickado
        Toast.makeText(this, "Item seleccionado: " + simpleList.get(position) , Toast.LENGTH_SHORT).show();

        // Para hacer transformaciones gráficas
        view.animate().rotationY(360).setDuration(1000).start();
    }
}
