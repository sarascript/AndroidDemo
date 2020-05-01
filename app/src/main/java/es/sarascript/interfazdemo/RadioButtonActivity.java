package es.sarascript.interfazdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    RadioGroup radioGroupGenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroupGenero = (RadioGroup) findViewById(R.id.radioGroupGenero);
    }


    // ---------------------------- RADIO BUTTON ------------------------------- (Un Radio Button se utiliza para marcar solo una opción)

        // 1º DESDE LOS RADIO BUTTON

        // Añadir a los Radio Button del .xml -> android:onClick="generoClicked"

        // Declarar la función que queramos vincular con el onClick

    public void generoClicked(View view) {
        String genero = "";

        // Detectar cuál ha sido el Radio Button marcado

        switch (view.getId()) {
            case R.id.radioButtonHombre:
                genero = "Hombre";
                break;
            case R.id.radioButtonMujer:
                genero = "Mujer";
                break;
            case R.id.radioButtonNoBinario:
                genero = "No Binario";
                break;
        }

        Toast.makeText(this, genero, Toast.LENGTH_SHORT).show();

    }

        // 1º DESDE EL RADIO GROUP

        // Declarar la variable radioGroup en la clase -> RadioGroup radioGroupGenero;

        // Conectar la variable con el elemento del .xml en el onCreate -> radioGroup = (RadioGroup) findViewById(R.id.radioGroupGenero);

        // Crear un botón en el .xml y añadirle android:onClick_"conocerGeneroMarcado"

        // Declarar la función que queramos vincular con el onClick

    public void conocerGeneroMarcado(View view) {
        String genero = "";
        int idChecked = radioGroupGenero.getCheckedRadioButtonId();

        // Detectar cuál ha sido el Radio Button marcado

        if (idChecked == R.id.radioButtonHombre) {
            genero = "Has seleccionado Hombre";
        } else if (idChecked == R.id.radioButtonMujer) {
            genero = "Has seleccionado Mujer";
        } else {
            genero = "Has seleccionado No Binario";
        }

        Toast.makeText(this, genero, Toast.LENGTH_SHORT).show();

    }

}
