package es.sarascript.fragmentsdemo;

import androidx.appcompat.app.AppCompatActivity;
import es.sarascript.fragmentsdemo.Fragments.ControlFragment;
import es.sarascript.fragmentsdemo.Fragments.FirstFragment;
import es.sarascript.fragmentsdemo.Interfaces.OnControlFragmentListener;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ComunicacionActivity extends AppCompatActivity implements OnControlFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion);


    // ---------------------------- COMUNICACIÓN FRAGMENT CON ACTIVITY -------------------------------

        // Cambiamos el layout del .xml por un FrameLayout y le damos un id

        // Creamos un Fragment incluyendo la opción de interface callbacks

        // Referenciamos el contenedor y le cargamos el fragment

        getSupportFragmentManager().beginTransaction().add(R.id.container, new ControlFragment()).commit();

        // Borramos la interfaz OnFragmentInteractionListener del Fragment y el método onButtonPressed y creamos una nueva -> new - java class (interface)

        // Creamos dos métodos en la interfaz para controlar los botones -> public void buttonColorClicked(String color);
        // public void buttonTextClicked(String text);

        // Cambiamos la interfaz que había en el Fragment por la nuestra

        // Cambiamos el layout del fragment por un ConstraintLayout y ponemos dos botones (color y texto)

        // En el onCreateView del fragment cambiamos el return por View view -> View view = inflater.inflate(R.layout.fragment_control, container, false);

        // En el onCreateView del fragment referenciamos los botones del .xml -> Button btnColor = (Button) view.findViewById(R.id.btnColor);
        // Button btnText = (Button) view.findViewById(R.id.btnText);

        // En el onCreateView del fragment creamos los métodos para cuando se pulsen los botones y llamamos al método declarado en la interfaz ->
        // btnColor.setOnClickListener(new View.OnClickListener() {
        //    public void onClick(View view) {
        //      mListener.buttonColorClicked("Rojo");
        //    }
        //});

        // En el onCreateView del fragment returneamos la vista -> return view;

        // Implementamos la interfaz y sus métodos en la activity -> public class ComunicacionActivity extends AppCompatActivity implements OnControlFragmentListener {

    }

    @Override
    public void buttonColorClicked(String color) {
        Toast.makeText(this, "Activity Color" + color , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void buttonTextClicked(String text) {
        Toast.makeText(this, "Activity Text" + text , Toast.LENGTH_SHORT).show();
    }
}