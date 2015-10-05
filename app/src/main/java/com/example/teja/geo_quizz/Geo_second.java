package com.example.teja.geo_quizz;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by teja on 04-10-2015.
 */
public class Geo_second extends AppCompatActivity {

    private Button Clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);

        Clear = (Button)findViewById(R.id.Clear);


    }

    public void heha(View v){

      SharedPreferences sp = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);

        SharedPreferences.Editor e = sp.edit();

         e.clear();
        e.commit();


    }

}
