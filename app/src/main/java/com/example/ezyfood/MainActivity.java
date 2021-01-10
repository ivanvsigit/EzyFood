package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
    }

    public void myOrder(View view) {
        Intent intent = new Intent(this, MyOrderActivity.class);
        startActivity(intent);
    }

    public void snackPage(View view) {
    }

    public void drinkPage(View view) {
        Intent intent = new Intent(this, drinksActivity.class);
        startActivity(intent);
    }

    public void foodPage(View view) {
    }

    public void payPage(View view) {
    }
}