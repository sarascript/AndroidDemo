package es.sarascript.navigationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);
    }


    // ---------------------------- OPTION MENU -------------------------------

        // Copiamos el código de creación de un option menu de la documentación

        // Creamos una carpeta menu en res y dentro un archivo option_menu.xml

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu); // aquí llamamos al option_menu.xml que hemos creado
        return true;
    }

        // En option_menu.xml añadimos un elemento Menu Item y le damos un id -> action_new_item

        // En option_menu.xml para cambiar el tipo de menú a toolbar le damos un icono al Menu Item
        // Pulsamos en showAsAction y marcamos ifRoom

        // Para manejar las acciones de clickar en los elementos:

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_new_item: // aquí llamamos a nuestros Menu Items
                Toast.makeText(this, "New item clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_search_item:
                Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
