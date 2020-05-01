package es.sarascript.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);


     // --------------------------- INTENT EXPLÍCITO --------------------------------

        // Crear un Bundle en la siguiente activity para recoger los datos

        Bundle extras = getIntent().getExtras();

        // Declarar y recoger los datos de cada variable pasada con el intent

        int n = extras.getInt("numero");
        String s = extras.getString("nombre");
    }
}
