package br.com.lucas.listmoviefatecipiranganoite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class ActivityListGenres extends AppCompatActivity {

    private RecyclerView mRecyclerViewGenres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_genres);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mRecyclerViewGenres = (RecyclerView) findViewById(R.id.recyclerViewGenres);
    }

}
