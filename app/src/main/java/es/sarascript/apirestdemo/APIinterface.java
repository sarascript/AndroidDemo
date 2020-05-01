package es.sarascript.apirestdemo;

import java.util.List;

import es.sarascript.apirestdemo.responses.ResponseAverias;
import es.sarascript.apirestdemo.responses.ResponseLogin;
import es.sarascript.apirestdemo.responses.ResponseRegister;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIinterface {

    // Método login

    @FormUrlEncoded // si la petición debe ser de tipo x-www-form-urlencoded lo indicamos así
    @POST("auth/login") // copiamos el final de la url, en la que se indica la ruta concreta de la petición
    // añadimos el modelo .java de la respuesta (ResponseLogin), un nombre para el método (doLogin)
    Call<ResponseLogin> doLogin(@Field("email") String e, // y añadimos los campos @Field que le vamos a pasar con el nombre exacto
                                @Field("password") String psw);

    // Método get averías

    @GET("averia/lista")
    Call<ResponseAverias> getAverias (@Query("X-API-KEY") String key); // en el caso de un GET, se le pasan @Query

}
