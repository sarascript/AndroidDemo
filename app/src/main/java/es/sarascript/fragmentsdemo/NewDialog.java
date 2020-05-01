package es.sarascript.fragmentsdemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import es.sarascript.fragmentsdemo.Interfaces.OnNewDialogListener;

public class NewDialog extends DialogFragment {

    // Implementamos la interfaz
    OnNewDialogListener mListener;

    // ---------------------------- DIALOG FRAGMENT -------------------------------

        // Creamos una nueva clase java NewDialog con Superclass (que extiende de) Dialog Fragment

        // Creamos el método onCreateDialog


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        // Pegamos el código de creación de diálogo de la documentación

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // Para incluir un layout personalizado

        LayoutInflater inflater = requireActivity().getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.dialog, null)); // seleccionamos el layout que queramos

        builder.setTitle("Nuevo diálogo") // Título que aparece dentro del cuadro de diálogo

                // Botón para realizar la acción del cuadro de diálogo
                .setPositiveButton("Guardar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(), "Guardado", Toast.LENGTH_SHORT).show();
                        // Llamamos al método onGuardarClickListener()
                        mListener.onGuardarClickListener();
                    }
                })

                // Botón para cerrar el cuadro de diálogo
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Cerrar el cuadro de diálogo
                        dialog.dismiss();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }

        // Creamos el método onAttach que comprueba si se ha implementado la interfaz OnNewDialogListener

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        // Verify that the host activity implements the callback interface
        try {
            // Instantiate the NoticeDialogListener so we can send events to the host
            mListener = (OnNewDialogListener) activity;
        } catch (ClassCastException e) {
            // The activity doesn't implement the interface, throw exception
            throw new ClassCastException(activity.toString()
                    + " must implement OnNewDialogListener");
        }
    }

        // Llamamos al método en el botón Guardar del cuadro de diálogo -> mListener.onGuardarClickListener()

}
