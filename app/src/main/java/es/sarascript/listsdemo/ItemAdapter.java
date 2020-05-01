package es.sarascript.listsdemo;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

// Hacemos que extienda de ArrayAdapter<Item> y generamos el constructor con contexto, resource y objects:List<T>

class ItemAdapter extends ArrayAdapter<Item>  {

        // Declaramos las variables que usa el adapter

    Context ctx;
    int layoutExample;
    List<Item> itemsList;

    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);

        // Guardamos las variables

        this.ctx = context;
        this.layoutExample = resource;
        this.itemsList = objects;

    }

        // Sobreescribimos el método getView()

    @NonNull
    @Override
    //Este método se invocará por cada elemento
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Código para recibir el layout y cargarlo
        View v = LayoutInflater.from(ctx).inflate(layoutExample, parent, false);

        // Obtener la información del elemento que se está iterando

        Item itemActual = itemsList.get(position);

        // Rescatar los elementos del layout

        TextView textViewTitle = (TextView) v.findViewById(R.id.textViewTitle);
        TextView textViewNumber = (TextView) v.findViewById(R.id.textViewNumber);
        ImageView imageViewAvatar = (ImageView) v.findViewById(R.id.imageViewAvatar);

        // Hacer un set de la info del elemento actual en los elementos del layout

        textViewTitle.setText(itemActual.getTitle());
        textViewNumber.setText(itemActual.getNumber() + " number");

        //Implementamos la librería Glide para gestionar URLs de imágenes (en los Gradle y permisos de internet en el manifest)

        if (!itemActual.getUrlImage().isEmpty()) {
            Glide.with(ctx).load(itemActual.getUrlImage()).into(imageViewAvatar);
        }

        return v;
    }
}
