package com.example.toxy.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by lolnoxy@gmail.com on 5/21/2017.
 */

public class GPS extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);
    }

    private void Locate(){
        TextView txt = (TextView) findViewById(R.id.wspolrzedne);

        txt.setText();
    }

}