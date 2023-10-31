package com.example.serializable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button buttonParcelable;
    private Button buttonSerailitzable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonParcelable = findViewById(R.id.buttonParcelable);
        buttonSerailitzable = findViewById(R.id.buttonSerialitzable);






        AnimeSer anime1 = new AnimeSer(1, "Anime1", "Anime1", "Anime1",1, "Anime1","Anime1");
        AnimeSer anime2 = new AnimeSer(2, "Anime2", "Anime2", "Anime2",2, "Anime2","Anime2");
        AnimeSer anime3 = new AnimeSer(3, "Anime3", "Anime3", "Anime3",3, "Anime3","Anime3");



        List<AnimeSer> animeSers = new ArrayList<>();
        animeSers.add(anime1);
        animeSers.add(anime2);
        animeSers.add(anime3);


        AnimePar anime4 = new AnimePar(1, "Anime1", "Anime1", "Anime1",1, "Anime1","Anime1");

        List<AnimePar> animePars = new ArrayList<>();
        animePars.add(anime4);



        buttonSerailitzable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("button", "Serialitzable");
                intent.putExtra("anime", anime2);
                intent.putExtra("animes", (Serializable) animeSers);

                startActivity(intent);
            }
        });

        buttonParcelable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("button", "Parcelable");
                intent.putExtra("anime", anime4);
               /* intent.putExtra("animes", (Parcelable) animeSers);*/

                startActivity(intent);


            }
        });

    }
}