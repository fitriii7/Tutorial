package com.example.androiddialognotif;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void open (View view) {
        AlertDialog.Builder alertDialogBulider = new AlertDialog.Builder(this);
        alertDialogBulider.setMessage("Are you sure, You wanted to make decision");
        alertDialogBulider.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this, "You clicked yes button",
                        Toast.LENGTH_LONG).show();
            }
        });
        alertDialogBulider.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = alertDialogBulider.create();
        alertDialog.show();
    }
}
