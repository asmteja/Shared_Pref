package com.example.teja.geo_quizz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Geo_First extends AppCompatActivity {

     private EditText edittext ,edittext2;
     private Button button1,button2;
     private String s,S,f;
    private  int i,I,v;
SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo__first);

        // inflating

        edittext =(EditText) findViewById(R.id.editText);
        edittext2 =(EditText) findViewById(R.id.editText2);

        button1 =(Button) findViewById(R.id.button1);
        button2 =(Button) findViewById(R.id.button2);

        sp = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);

         f=sp.getString("Name", "Name");
         v=sp.getInt("age",0);

        if(((f != null & f!="Name") & v > 0)){

            Intent q = new Intent(this,Geo_second.class);
            startActivity(q);

        }


    }
public void heha( View v){
    SharedPreferences.Editor e = sp.edit();


        switch(v.getId()){

            case R.id.button1:
                s=edittext.getText().toString();
                i=Integer.parseInt(edittext2.getText().toString());

                if(s==null || i <=0 ){




                    Toast i = Toast.makeText(getApplicationContext(),"Please enter all values",Toast.LENGTH_LONG);
                    i.show();
                }

              else {


                    e.putString("Name", edittext.getText().toString());
                    e.putInt("age", Integer.parseInt(edittext2.getText().toString()));
                    e.commit();
                }
                break;
            case R.id.button2:





                S = sp.getString("Name", "Name" );
                I =sp.getInt("age", 0);

                Toast p = Toast.makeText(getApplicationContext(),S + I ,Toast.LENGTH_LONG);
                p.show();

                break;

        }




}


}
