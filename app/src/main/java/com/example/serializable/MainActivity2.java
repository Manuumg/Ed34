package com.example.serializable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView =  findViewById(R.id.textView);


        //Hook
        Intent intent = this.getIntent();



        if(intent.getStringExtra("button").equals("Serialitzable")){
            AnimeSer anime = (AnimeSer) intent.getSerializableExtra("anime");
            List<AnimeSer> animes = (List<AnimeSer>)intent.getSerializableExtra("animes");
            textView.setText(anime.toString());
        }

       else {
            AnimePar anime = intent.getParcelableExtra("anime");
           /* List<AnimeSer> animes = (List<AnimeSer>)intent.getParcelableExtra("animes")*/
            textView.setText(anime.toString());
        }
    }
}