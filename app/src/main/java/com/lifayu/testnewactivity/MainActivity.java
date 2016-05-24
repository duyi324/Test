package com.lifayu.testnewactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this, NewActivity.class), 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        //String result = data.getExtras().getString("result");
        TextView textView = (TextView)findViewById(R.id.textview);
        textView.setText(requestCode + "&&" + resultCode);
        Toast.makeText(this, "哈哈", Toast.LENGTH_LONG).show();
    }


}
