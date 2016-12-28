package com.example.robson.myapplication01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main01);
    }

    public void clickBotao(View view) {
        Toast.makeText(this, "Oi", Toast.LENGTH_SHORT).show();
    }
}
