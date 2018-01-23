package com.example.ernesto.clase4intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pantalla2Activity extends AppCompatActivity {

    //public final static String KEY_TEXTO = "texto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);


        Intent i = getIntent();
        Bundle b = i.getExtras();
        String s = b.getString("texto");
        String apellido = b.getString("apellido");

        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(s);

        TextView lastname = (TextView)findViewById(R.id.txtApellido);
        lastname.setText(apellido);


    }
}
