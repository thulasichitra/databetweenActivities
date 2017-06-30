package com.example.mlrit.databetweenactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mlrit on 6/30/2017.
 */

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        Bundle b = getIntent().getExtras();

        TextView name = (TextView) findViewById(R.id.textView4);

        name.setText(b.getCharSequence("name"));
    }
}