package es.sarascript.listsdemo;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Item} and makes a call to the
 * specified {@link OnItemInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */

    // Cambiamos todos los DummyItem por Item y la interfaz por la que hemos creado (OnItemInteractionListener)
    // En el onBindViewHolder la cambiamos por onItemClick()

public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<Item> mValues;
    private final OnItemInteractionListener mListener;
    private Context ctx;

    // Le añadimos el contexto
    public MyItemRecyclerViewAdapter(Context context, List<Item> items, OnItemInteractionListener listener) {
        mValues = items;
        mListener = listener;
        ctx = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_item, parent, false); // Cambiamos el layout por item_item.xml
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);

        // Modificamos las variables por las de Item y hacemos un set de la info del elemento actual en los elementos del layout
        holder.textViewTitle.setText(holder.mItem.getTitle());
        holder.textViewNumber.setText(holder.mItem.getNumber());

        // Implementamos la librería Glide para gestionar URLs de imágenes (en los Gradle y permisos de internet en el manifest)

        if (!holder.mItem.getUrlImage().isEmpty()) {
            Glide.with(ctx).load(holder.mItem.getUrlImage()).into(holder.imageViewAvatar);
        }

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.OnItemClick(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;

        // Modificamos las variables por las de nuestro Item
        public final TextView textViewTitle;
        public final TextView textViewNumber;
        public final ImageView imageViewAvatar;

        public Item mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;

        // Enlazamos las variables del Item con sus elementos del layout item_item.xml
            textViewTitle = (TextView) view.findViewById(R.id.textViewTitle);
            textViewNumber = (TextView) view.findViewById(R.id.textViewNumber);
            imageViewAvatar = (ImageView) view.findViewById(R.id.imageViewAvatar);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + textViewTitle.getText() + "'" + " '" + textViewNumber.getText() + "'";
        }
    }
}
