package com.example.cjcucsie.intent_first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {


    private Button button2;
    private Button.OnClickListener listener = new Button.OnClickListener(){

        @Override
        public void onClick(View v) {

// TODO Auto-generated method stub
            Intent intent = new Intent();
            intent.setClass(Main2Activity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
// TODO Auto-generated method stub

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(listener );
    }
}
