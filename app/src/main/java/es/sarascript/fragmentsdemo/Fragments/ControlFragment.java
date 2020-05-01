package es.sarascript.fragmentsdemo.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import es.sarascript.fragmentsdemo.Interfaces.OnControlFragmentListener;
import es.sarascript.fragmentsdemo.R;

public class ControlFragment extends Fragment {


    // ---------------------------- COMUNICACIÓN FRAGMENT CON ACTIVITY -------------------------------

        // Cambiamos la interfaz que había por la nuestra (en todas sus declaraciones)

    private OnControlFragmentListener mListener; // Referencia a la activity

    public ControlFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // Cambiamos el return por View view para crear la vista

        View view = inflater.inflate(R.layout.fragment_control, container, false);

        // Referenciamos los botones del .xml

        Button btnColor = (Button) view.findViewById(R.id.btnColor);

        Button btnText = (Button) view.findViewById(R.id.btnText);

        // Creamos los métodos para cuando se pulsen los botones

        btnColor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

        // Llamamos al método declarado en la interfaz

                mListener.buttonColorClicked("Rojo");

            }
        });

        btnText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

        // Llamamos al método declarado en la interfaz

                mListener.buttonTextClicked("Hola");

            }
        });

        // Returneamos la vista

        return view;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnControlFragmentListener) {
            mListener = (OnControlFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnControlFragmentListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
