package es.sarascript.interfazdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class GlideActivity extends AppCompatActivity {
    ImageView logotipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);


    // ---------------------------- GLIDE ------------------------------- (Librería para descargar imágenes de url)

        // Añadimos a los repositorios dentro de allprojects del Gradle (InterfazDemo) -> mavenCentral()
        // google()

        // Añadimos a las dependecias del Gradle (app) -> implementation 'com.github.bumptech.glide:glide:4.11.0'
        //  annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'

        // En el manifest damos permiso a internet -> <uses-permission android:name="android.permission.INTERNET"></uses-permission>

        // Creamos una ImageView en el .xml

        // Declarar la variable logo en la clase -> ImageView logotipo;

        // Conectar la variable con el elemento del .xml en el onCreate -> logo = (ImageView) findViewById(R.id.imageViewLogo);

        logotipo = (ImageView) findViewById(R.id.imageViewLogotipo);

        // Código para coger una imagen de una url y convertirla en un elemento ImageView

        // RequestOptions cropOptions = new RequestOptions().centerCrop(this); // Para añadir modificaciones a la imagen

        Glide.with(this) // modificar el contexto (normalmente this)
                .load("https://cdn01.diarimes.com/uploads/imagenes/10col/2018/06/10/_catzenneger_0dd450a1.jpg?29338e018e638459cb023fe2b9746b51") // modificar la url de la imagen
                // .apply(cropOptions)
                .into(logotipo); // modificar el elemento de tipo ImageView en el que queremos guardar la imagen

    }
}
