package es.sarascript.listsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapterActivity extends AppCompatActivity {
    ListView adapterListView;
    List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_adapter);


    // ---------------------------- LIST VIEW SIMPLE -------------------------------

        // Creamos un elemento ListView en el .xml, le ponemos un id y los constraints en vista diseño

        // Declaramos una variable y le asignamos el ListView -> ListView adapterListView;

        adapterListView = (ListView) findViewById(R.id.listViewAdapter);

        // Para rellenar la lista creamos un objeto lista de Item (nuestra propia clase POJO) -> List<Item> itemList;

        // Creamos la clase Item.java, definimos los campos que va a tener cada elemento de la ListView
        // y generamos los constructores y getters and setters

        itemList = new ArrayList<>();
        itemList.add(new Item("Común Europeo", 1, "https://www.dogalize.com/wp-content/uploads/2017/02/gato-atigrado-gris-830x574.jpg"));
        itemList.add(new Item("Persa", 2, "https://www.dogalize.com/wp-content/uploads/2017/03/618d1db311ec4c0b2a519371c3f4151f.jpg"));
        itemList.add(new Item("Maine Coon", 3, "https://www.zooplus.es/magazine/wp-content/uploads/2018/08/maine-coon-3-768x658.jpg"));

        // Para unir la lista con el ListView necesitamos utilizar un adapter

        // Creamos nuestro propio adapter, creamos la clase ItemAdapter.java y hacemos que extienda de ArrayAdapter(Item)
        // y generamos el constructor con contexto, resource y objects:List<T>

        ItemAdapter mAdapter = new ItemAdapter(
                this,
                R.layout.item_item, // Layout necesario para indicar cómo dibujar la lista, creamos el nuestro propio
                itemList // listado de elementos
        );

        // Creamos el layout item_item.xml con todos los campos que tiene la clase Item.java y les damos un id

        // Completamos el código del ItemAdapter.java para conectar la lista con el layout

        adapterListView.setAdapter(mAdapter);

    }
}
