package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class drinksActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.ezyfood.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        Intent intent = getIntent();
    }

    public void myOrder(View view) {
        Intent intent = new Intent(this, MyOrderActivity.class);
        startActivity(intent);
    }

    public void orderPage1(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        Button button = (Button) findViewById(R.id.airBtn);
        String message = button.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void orderPage2(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        Button button = (Button) findViewById(R.id.apelBtn);
        String message = button.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void orderPage3(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        Button button = (Button) findViewById(R.id.manggaBtn);
        String message = button.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void orderPage4(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        Button button = (Button) findViewById(R.id.alpukatBtn);
        String message = button.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}