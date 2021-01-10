package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Vector;

public class OrderActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.ezyfood.MESSAGE";
    public static Vector<Order> orders = new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String message = intent.getStringExtra(drinksActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.drink);
        textView.setText(message);
    }


    public void myOrder(View view) {
        Intent intent = new Intent(this, MyOrderActivity.class);
        startActivity(intent);
    }

    public void drinkPage(View view) {
        Intent intent = new Intent(this, drinksActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        int qty = Integer.parseInt(editText.getText().toString());
        TextView textView = (TextView) findViewById(R.id.drink);
        String drink = textView.getText().toString();
        int price = 123;
        Order order = new Order(drink, qty, price);
        orders.add(order);
        startActivity(intent);
    }
}