package es.sarascript.interfazdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoActivity extends AppCompatActivity {
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);


    // ---------------------------- PICASSO ------------------------------- (Librería para descargar imágenes de url)

        // Añadimos a las dependecias del Gradle (app) -> implementation 'com.squareup.picasso:picasso:2.71828'

        // En el manifest damos permiso a internet -> <uses-permission android:name="android.permission.INTERNET"></uses-permission>

        // Creamos una ImageView en el .xml

        // Declarar la variable logo en la clase -> ImageView logo;

        // Conectar la variable con el elemento del .xml en el onCreate -> logo = (ImageView) findViewById(R.id.imageViewLogo);

        logo = (ImageView) findViewById(R.id.imageViewLogo);

        // Código para coger una imagen de una url y convertirla en un elemento ImageView

        Picasso.get()
                .load("https://cnnespanol2.files.wordpress.com/2019/05/grumpy-cat-foto.jpg?quality=100&strip=info") // modificar la url de la imagen
                // .resize(200, 100) // redimensionar la imagen
                // .centerCrop() // centrar la imagen y recortar lo que sobra
                // .placeholder(R.drawable.user_placeholder) // utilizar una imagen de placeholder que tengamos en local
                // .error(R.drawable.user_placeholder_error) // utilizar una imagen de error que tengamos en local
                .into(logo); // modificar el elemento de tipo ImageView en el que queremos guardar la imagen
    }
}

