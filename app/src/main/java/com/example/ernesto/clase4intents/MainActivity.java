package com.example.ernesto.clase4intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity
        extends AppCompatActivity
        implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(this);

        Button v = (Button)findViewById(R.id.button2);
        v.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button:

            Log.d("act", "se hizo click!");

            EditText editText = (EditText) findViewById(R.id.editText);
            EditText editText1 = (EditText) findViewById(R.id.txtApellido);
            String s = editText.getText().toString();
            String apellido = editText1.getText().toString();


            Intent i = new Intent(this, Pantalla2Activity.class);
            i.putExtra("texto", s);
            i.putExtra("apellido", apellido);


            startActivity(i);
            break;

            case R.id.button2:
                Intent w = new Intent(Intent.ACTION_VIEW);
                w.setData(Uri.parse("https://www.taringa.net/"));
                startActivity(w);
                break;

        }
    }
}
