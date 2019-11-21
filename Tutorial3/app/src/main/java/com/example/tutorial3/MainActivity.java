package com.example.tutorial3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        header = (TextView) findViewById(R.id.txtHeader);
    }
    public void launchSecondActivity(View view) {
     //membuat object Intent
        Intent intent = new Intent(this, SecondActivity.class);
        //menjalankan activity dengan parameter intent
        startActivity(intent);
    }

}
