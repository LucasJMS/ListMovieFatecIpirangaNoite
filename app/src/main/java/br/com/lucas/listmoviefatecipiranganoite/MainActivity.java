package br.com.lucas.listmoviefatecipiranganoite;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        */

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        CollapsingToolbarLayout collapsingToolbar = findViewById(R.id.collapsingToolbar);
        collapsingToolbar.setTitle("Homem-Aranha");
    }


}
