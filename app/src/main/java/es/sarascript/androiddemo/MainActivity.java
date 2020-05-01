package es.sarascript.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     // ---------------------------- EVENTO CLICK -------------------------------

        // 1º CON LISTENER

        // Declarar la variable texto en la clase -> TextView texto;

        // Conectar la variable con el elemento del .xml

        texto = (TextView)findViewById(R.id.textoEvento); //findViewById nos devuelve un objeto View, así que tenemos que castearlo a TextView.

        // Añadir un listener a la variable y añadirle la función que queramos en el onClick

        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Has hecho click con listener", Toast.LENGTH_SHORT).show();
            }
        });
    }

        // 2º CON ONCLICK EN EL ELEMENTO

        // Añadir al elemento del .xml -> android:onClick="iniciarToast"

        // Declarar la función que queramos vincular con el onClick

    public void iniciarToast(View view) {
        Toast.makeText(this, "Has hecho click en el texto", Toast.LENGTH_SHORT).show();
    }


    // --------------------------- INTENT EXPLÍCITO -------------------------------- (Un intent explícito se utiliza para lanzar otra activity)

        // Declarar el intent con la activity a la que queramos ir

    public void iniciarActivity(View view) {
        Intent intentSecondary = new Intent(this, SecondaryActivity.class);

        // Añadir los datos que queramos pasar con el intent a la siguiente activity

        intentSecondary.putExtra("numero", 7);
        intentSecondary.putExtra("nombre", "Sara");

        // Crear un Bundle en la siguiente activity para recoger los datos

            //Bundle extras = getIntent().getExtras();

        // Declarar y recoger los datos de cada variable pasada con el intent

            //int n = extras.getInt("numero");
            //String s = extras.getString("nombre");

        startActivity(intentSecondary);
    }


    // --------------------------- INTENT IMPLÍCITO -------------------------------- (Un intent implícito se utiliza para lanzar otra aplicación)

        // 1º EJEMPLO DE ALARMA

    public void crearAlarma(View view) {

        // Declarar el intent con la aplicación a la que queramos ir y los datos que queramos pasarle

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Estudiar")
                .putExtra(AlarmClock.EXTRA_HOUR, 11)
                .putExtra(AlarmClock.EXTRA_MINUTES, 30);

        // Comprobar que se ha podido acceder a una aplicación que recoja este intent antes de lanzarlo

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


        // 1º EJEMPLO DE ALARMA

    public void marcarTelefono(View view) {

        // Declarar el intent con la aplicación a la que queramos ir y los datos que queramos pasarle

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:112"));

        // Comprobar que se ha podido acceder a una aplicación que recoja este intent antes de lanzarlo

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}


    // --------------------------- GESTIÓN INTENT IMPLÍCITO -------------------------------- (Para que nuestra aplicación acepte intents implícitos de otras aplicaciones)

/*

// Dentro de la declaración de la activity en el manifest

<activity android:name=".GestionIntentsImplicitosActivity">

// Para decirle al SO que nuestra app puede gestionar la acción que le indiquemos

    <intent-filter>
        <action android:name="android.intent.action.SET_ALARM"/>
        <category android:name="android.intent.category.DEFAULT"/>
    </intent-filter>

</activity>

*/
