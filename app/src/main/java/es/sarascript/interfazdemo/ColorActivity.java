package es.sarascript.interfazdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
    }
}


    // ---------------------------- COLOR -------------------------------

        // Primero elegimos una paleta de color https://material.io/design/color/the-color-system.html#tools-for-picking-colors (Apartado 2014 Material Design color palettes)
        // Además, en estas paletas podemos ver si debemos usar letra blanca o negra según el tono

        // En res - values - colors.xml cambiamos los valores por defecto por los de la paleta que elijamos

        // El color primario debe ser el Nº 500 de la paleta.

        // El color primario oscuro debe ser el Nº 900 de la paleta.

        // El color accent puede ser el complementario (https://color.adobe.com/create) o el primario oscuro. Suele usarse para elementos seleccionados, botones, etc.

        // <color name="colorPrimary">#E91E63</color>
        // <color name="colorPrimaryDark">#880E4F</color>
        // <color name="colorAccent">#03A847</color>

        // Para nombrar a estos colores definidos -> @color/colorPrimary

        // Para cambiar el color de fondo de un elemento en el .xml -> android:background="@color/colorPrimaryDark"
        // Para cambiar el color de letra de un elemento en el .xml -> android:textColor="@android:color/white"