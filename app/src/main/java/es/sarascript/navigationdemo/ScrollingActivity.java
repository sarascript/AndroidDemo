package es.sarascript.navigationdemo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;

public class ScrollingActivity extends AppCompatActivity {

    // ---------------------------- SCROLLING -------------------------------

        // Creamos una activity de tipo Scrolling


        // El activity_scrolling.xml contiene el header, el contenido (content_scrolling.xml) y el botón blotante

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Para cambiar la imagen y el texto del header

        ImageView image = (ImageView) findViewById(R.id.imageHeader);

        image.setImageResource(R.drawable.ic_launcher_background);

        setTitle("Header");

    }
}
