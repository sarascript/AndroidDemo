package es.sarascript.listsdemo;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ItemFragment extends Fragment {

    // Declaramos nuestra interfaz y la cambiamos donde aparecía la otra
    OnItemInteractionListener mListener;

    // Declaramos la lista de items
    List<Item> itemRecyclerList;

    public ItemFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));

        // Instanciamos y rellenamos la lista de items
            itemRecyclerList = new ArrayList<>();

            itemRecyclerList.add(new Item("Común Europeo", 1, "https://www.dogalize.com/wp-content/uploads/2017/02/gato-atigrado-gris-830x574.jpg"));
            itemRecyclerList.add(new Item("Persa", 2, "https://www.dogalize.com/wp-content/uploads/2017/03/618d1db311ec4c0b2a519371c3f4151f.jpg"));
            itemRecyclerList.add(new Item("Maine Coon", 3, "https://www.zooplus.es/magazine/wp-content/uploads/2018/08/maine-coon-3-768x658.jpg"));

        // Añadimos la lista al adapter y le pasamos el contexto (getActivity())

            recyclerView.setAdapter(new MyItemRecyclerViewAdapter(getActivity(), itemRecyclerList, mListener));

        // Cambiamos todos los DummyItem del MyItemRecyclerViewAdapter por Item y la interfaz por la que hemos creado (OnItemInteractionListener)

        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnItemInteractionListener) {
            mListener = (OnItemInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
