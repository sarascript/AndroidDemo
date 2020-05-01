package es.sarascript.apirestdemo;

import androidx.appcompat.app.AppCompatActivity;
import es.sarascript.apirestdemo.commons.Constants;
import es.sarascript.apirestdemo.responses.ResponseLogin;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import android.os.Bundle;
import android.widget.Toast;

import java.net.HttpURLConnection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    // ---------------------------- API REST - RETROFIT -------------------------------

        // Implementamos la librería Retrofit en el Gradle -> implementation 'com.squareup.retrofit2:retrofit:(insert latest version)'
        // y los conversores a Gson -> implementation 'com.squareup.retrofit2:converter-gson:2.8.1', implementation 'com.google.code.gson:gson:2.8.6'
        // (para convertir JSON a un objeto Java)

        // Añadimos los permisos de internet al manifest -> <uses-permission android:name="android.permission.INTERNET" />

        // Descargamos la app Postman para probar las peticiones a APIs
        // para probar hacermos un POST a http://miguelcamposrivera.com/mecaround/api/v1/auth/register
        // y en body seleccionamos x-www-form-urlencoded y metemos las key-value nombre-Sara, email-sara@mail.com y password-1234

        // Copiamos la respuesta de la petición y la pegamos en http://www.jsonschema2pojo.org
        // ponemos el nombre del package de nuestra app + responses(es.sarascript.apirestdemo.responses) y class name ResponseRegister
        // creamos una carpeta responses donde las clases java
        // source type - JSON, annotation style - Gson, y marcamos todo hasta Include constructors menos Use Joda dates y Use Commons-Lang3
        // generamos un .zip, cogemos la clase y la pegamos en nuestra carpeta responses
        // repetimos para cada petición que vayamos a hacer a la API

        // Creamos una interfaz donde declaramos los métodos que vamos a usar para conectarnos a la API -> APIinterface.java
        // @FormUrlEncoded // si la petición debe ser de tipo x-www-form-urlencoded lo indicamos así
        // @POST("auth/login") // copiamos el final de la url, en la que se indica la ruta concreta de la petición
        // añadimos el modelo .java de la respuesta (ResponseLogin), un nombre para el método (doLogin)
        // Call<ResponseLogin> doLogin(@Field("email") String e, // y añadimos los campos @Field que le vamos a pasar con el nombre exacto
        // @Field("password") String psw);

        // Creamos una carpeta commons y creamos una clase Constants.java
        // añadimos una constante con la url base de la API -> public static final String API_BASEURL = "http://miguelcamposrivera.com/mecaround/api/v1/";

        // Inicializamos Retrofit

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.API_BASEURL) // añadimos la url base de la API
                .addConverterFactory(GsonConverterFactory.create()) // añadimos la conversión a Gson
                .build();

        // Para conectar Retrofit con la interfaz

        APIinterface apiService = retrofit.create(APIinterface.class);

        // Realizar la petición

        Call<ResponseLogin> resLogin = apiService.doLogin("email", "password");

        resLogin.enqueue(new Callback<ResponseLogin>() {
            @Override
            public void onResponse(Call<ResponseLogin> call, Response<ResponseLogin> response) {
                if (response.code() == HttpURLConnection.HTTP_OK) { // Comprobar que la petición ha dado código OK
                    // Acceder a los datos de la respuesta
                    String emailResponse = response.body().getEmail();
                    String nombreResponse = response.body().getNombre();
                    String keyResponse = response.body().getKey();

                    // Hacer login

                } else {
                    Toast.makeText(MainActivity.this, "Usuario y/o contraseña incorrecto", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseLogin> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error en la petición", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
