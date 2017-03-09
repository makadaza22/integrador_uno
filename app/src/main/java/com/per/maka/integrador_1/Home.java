package com.per.maka.integrador_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button whoppers;
    Button hotDogs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        whoppers = (Button) findViewById(R.id.btn_whopper);
        hotDogs = (Button) findViewById(R.id.btn_hotDog);

        //----- crear los listeners aqui
    }
}
