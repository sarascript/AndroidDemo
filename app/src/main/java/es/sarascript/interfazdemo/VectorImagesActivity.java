package es.sarascript.interfazdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class VectorImagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_images);
    }
}

    // ---------------------------- VECTOR IMAGES -------------------------------

        // App - Res - Drawable hacemos click derecho y pulsamos New - Vector Asset

        // Elegimos Clip Art (si queremos usar un icono de la galería de Google) o Local File (si queremos utilizar uno propio, menos recomendado -> flaticon.es)

        // Pulsamos en el icono del Clip Art para buscar cualquier icono, y seleccionamos el resto de características que queramos.

        // Para utilizarlo arrastramos una ImageView en la vista de diseño del .xml y se abrirá una ventana de selección.

        // También podemos cambiar la ruta en el elemento -> app:srcCompat="@drawable/ic_camera_black_24dp"

        // Si queremos cambiar las dimensiones, podemos abrir el archivo del icono .xml y cambiarla allí, o en el elemento ImageView.