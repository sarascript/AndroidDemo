package es.sarascript.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GestionIntentsImplicitosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_intents_implicitos);
    }
}


// --------------------------- GESTIÓN INTENT IMPLÍCITO --------------------------------

/*

// Dentro de la declaración de la activity  en el manifest

<activity android:name=".GestionIntentsImplicitosActivity">

// Para decirle al SO que nuestra app puede gestionar la acción que le indiquemos

    <intent-filter>
        <action android:name="android.intent.action.SET_ALARM"/>
        <category android:name="android.intent.category.DEFAULT"/>
    </intent-filter>

</activity>

*/
