package es.sarascript.navigationdemo;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class TabsActivity extends AppCompatActivity {


    // ---------------------------- TAGS (BOTTOM NAVIGATION) -------------------------------

        // Creamos una activity de tipo Bottom Navigation


        // El activity_tabs.xml contiene el bottom_nav_menu.xml y el mobile_navigation.xml
        // El bottom_nav_menu.xml contiene el menú del Bottom Navigation
        // El mobile_navigation.xml contiene los fragments para cada opción del menú seleccionada

        // Cambiar el layout del activity_tabs.xml (contenido de la página) a FrameLayout y ponerle un id

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

}
