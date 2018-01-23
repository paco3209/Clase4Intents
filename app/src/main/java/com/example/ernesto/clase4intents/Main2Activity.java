package com.example.ernesto.clase4intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b = (Button)findViewById(R.id.button3);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent a = new Intent(this,MainActivity.class);
        startActivity(a);

    }
}
