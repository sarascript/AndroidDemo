package es.sarascript.listsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RecyclerViewActivity extends AppCompatActivity implements OnItemInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

    // ---------------------------- RECYCLER VIEW -------------------------------

        // Creamos un fragment de tipo List sin incluir factory methods

        // Creamos la clase Item.java, definimos los campos que va a tener cada elemento de la lista
        // y generamos los constructores y getters and setters

        // Eliminamos la carpeta dummy que contiene datos de prueba, y la interfaz y el if/else del onCreateView del ItemFragment.java

        // Creamos la interfaz OnItemInteractionListener, creamos el método onItemClick -> public void onItemClick(Item item);
        // la implementamos en el RecyclerViewActivity y su método
        // y la declaramos en el Fragment -> OnItemInteractionListener mListener; y la cambiamos donde aparecía la otra

        // Declaramos en el Fragment la lista de items -> List<Item> itemRecyclerList; y la instanciamos y rellenamos en el onCreateView()

        // Añadimos la lista al adapter y le pasamos el contexto (getActivity()) -> recyclerView.setAdapter(new MyItemRecyclerViewAdapter(getActivity(), itemRecyclerList, mListener));

        // Cambiamos todos los DummyItem del MyItemRecyclerViewAdapter por Item
        // Le añadimos el contexto -> public MyItemRecyclerViewAdapter(Context context, List<Item> items, OnItemInteractionListener listener) {
        // y la interfaz por la que hemos creado (OnItemInteractionListener), en el onBindViewHolder la cambiamos por onItemClick()
        // En el onCreateViewHolder() cambiamos el layout por item_item.xml

        // Creamos el layout item_item.xml con todos los campos que tiene la clase Item.java y les damos un id

        // En el activity_recycler_view.xml añadimos un componente Fragment con el ItemFragment

        // En el ViewHolder() del adapter modificamos las variables por las de nuestro Item
        // y las enlazamos con sus elementos del layout item_item.xml

        // En el onBindViewHolder() del adapter modificamos las variables por las de nuestro Item
        // y hacemos un set de la info del elemento actual en los elementos del layout -> holder.textViewTitle.setText(holder.mItem.getTitle());


            // PARA CAMBIAR EL ESTILO DE LOS ITEMS DE LA LISTA POR CARD VIEW:

            // App - open module settins - dependencies - añadir - library dependencies - buscamos cardview y la añadimos

            // En el item_item.xml cambiamos el layout por CardView y metemos dentro un ConstraintLayout

            // Añadimos las siguientes propiedades al CardView de item_item.xml
            // android:layout_height="wrap_content"
            // android:elevation="@dimen/cardview_default_elevation"
            // android:layout_marginBottom="16dp"
            // Añadimos android:padding="8dp" al fragment_item:list.xml

    }

    @Override
    public void OnItemClick(Item mItem) {

    }
}
