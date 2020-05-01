package es.sarascript.navigationdemo;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class NavigationDrawerActivity extends AppCompatActivity {


    // ---------------------------- NAVIGATION DRAWER -------------------------------

        // Creamos una activity de tipo Navigation Drawer


        // El activity_navigation_drawer contiene el nav_header_navigation_drawer.xml, activity_navigation_drawer_drawer y el app_bar_navigation_drawer.xml
        // El nav_header_navigation_drawer.xml contiene el header del drawer
        // El activity_navigation_drawer_drawer contiene el menú del drawer
        // El app_bar_navigation_drawer.xml contiene el contenido del drawer
        // El content_navigation_drawer.xml contiene el mobile_navigation_drawer_drawer.xml
        // El mobile_navigation_drawer.xml contiene los fragments para cada opción del drawer seleccionada


        // Cambiar el layout del content_navigation_drawer.xml (contenido de la página) a FrameLayout y ponerle un id

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        // Para acceder a elementos del Navigation Drawer

        // Header

        ImageView ivAvatar = navigationView.getHeaderView(0).findViewById(R.id.imageViewAvatar);
        ivAvatar.setImageResource(R.drawable.ic_launcher_foreground);

        TextView name = (TextView) navigationView.getHeaderView(0).findViewById(R.id.textViewName);
        TextView email = (TextView) navigationView.getHeaderView(0).findViewById(R.id.textViewEmail);
        name.setText("Sara");
        email.setText("sara@mail.com");

        LinearLayout headerBackground = navigationView.getHeaderView(0).findViewById(R.id.headerBackground);
        headerBackground.setBackgroundResource(R.drawable.ic_launcher_background);

        // Modificar el color del header en el side_nav_bar.xml

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
