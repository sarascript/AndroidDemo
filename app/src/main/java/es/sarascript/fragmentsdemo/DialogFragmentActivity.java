package es.sarascript.fragmentsdemo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import es.sarascript.fragmentsdemo.Interfaces.OnNewDialogListener;

import android.view.View;
import android.widget.Toast;

public class DialogFragmentActivity extends AppCompatActivity implements OnNewDialogListener {
    DialogFragment nuevoDialogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_fragment);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nuevoDialogo = new NewDialog();
                nuevoDialogo.show(getSupportFragmentManager(), "Nuevo diálogo");
            }
        });
    }

    @Override
    public void onGuardarClickListener() {
        Toast.makeText(this, "Se han recibido los datos del dialog", Toast.LENGTH_SHORT).show();
    }
}


    // ---------------------------- DIALOG FRAGMENT -------------------------------

        // Creamos una nueva clase java NewDialog con Superclass (que extiende de) Dialog Fragment

        // Creamos el método onCreateDialog

        // Pegamos el código de creación de diálogo de la documentación

        // Declaramos en la activity una instancia de DialogFragment -> DialogFragment nuevoDialogo;

        // En el botón de la activity creamos una instancia de la clase java NewDialog() -> nuevoDialogo = new NewDialog();
        // nuevoDialogo.show(getSupportFragmentManager(), "Nuevo diálogo");

        // Creamos un nuevo layout para diseñar el cuadro de diálogo y lo añadimos al onCreateDialog de NewDialog.java

        // Para recoger los datos del diálogo, creamos una nueva interfaz OnNewDialogListener y un método public void onGuardarClickListener();

        // Implementamos la interfaz y el método en el activity.

        // En NewDialog.java implementamos la interfaz -> OnNewDialogListener mListener;

        // En NewDialog.java creamos el método onAttach que comprueba si se ha implementado la interfaz OnNewDialogListener

        // Llamamos al método en el botón Guardar del cuadro de diálogo -> mListener.onGuardarClickListener()