package com.lifayu.testnewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        setResult(666, intent  );
    }
}
