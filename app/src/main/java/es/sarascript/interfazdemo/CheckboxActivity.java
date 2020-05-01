package es.sarascript.interfazdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckboxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
    }


    // ---------------------------- CHECKBOX ------------------------------- (Un CheckBox se utiliza para marcar una o varias opciones)

        // Añadir a los CheckBox del .xml -> android:onClick="generoClicked"

        // Declarar la función que queramos vincular con el onClick

    public void generoClicked(View view) {
        String genero = "";

        // Detectar si el CheckBox ha sido marcado

        CheckBox checkbox = (CheckBox) view; //para castear el objeto View que lanza la función en objeto CheckBox
        boolean checked = checkbox.isChecked();

        // Detectar cuál ha sido el CheckBox marcado

        switch (view.getId()) {
            case R.id.checkBoxHombre:
                genero = "Hombre";
                break;
            case R.id.checkBoxMujer:
                genero = "Mujer";
                break;
            case R.id.checkBoxNoBinario:
                genero = "No Binario";
                break;
        }

        Toast.makeText(this, genero + " ("+checked+")", Toast.LENGTH_SHORT).show();

    }
}
