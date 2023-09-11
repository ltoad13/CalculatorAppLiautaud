package com.example.calculatorappliautaud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    double startNum;

    String operations;
    public void numSelected(View V) {
        TextView answer = findViewById(R.id.answer);
        //when you click on a button that operation is added to the string and at the end that
        // string is evaluated
        if (V.getId()== R.id.equals){
            Log.i("Lizzy", "Selected answer");
            answer.setText("" + performOperation(operations));
            operations = "";
        }
        else if (V.getId() == R.id.clear) {
            Log.i("Lizzy", "Selected clear");
            answer.setText(" ");
        }
        else if (V.getId() == R.id.decimal) {
            Log.i("Lizzy", "Selected decimal");

        }
        else if (V.getId() == R.id.divide) {
            Log.i("Lizzy", "Selected divide");

        }
        else if (V.getId() == R.id.minus) {
            Log.i("Lizzy", "Selected minus");

        }
        else if (V.getId() == R.id.percent) {
            Log.i("Lizzy", "Selected percent");

        }
        else if (V.getId() == R.id.nine) {
            Log.i("Lizzy", "Selected nine");

        }
        else if (V.getId() == R.id.eight) {
            Log.i("Lizzy", "Selected 8");

        }
        else if (V.getId() == R.id.seven) {
            Log.i("Lizzy", "Selected 7");

        }
        else if (V.getId() == R.id.six) {
            Log.i("Lizzy", "Selected 6");

        }
        else if (V.getId() == R.id.five) {
            Log.i("Lizzy", "Selected 5");

        }
        else if (V.getId() == R.id.four) {
            Log.i("Lizzy", "Selected 4");

        }
        else if (V.getId() == R.id.three) {
            Log.i("Lizzy", "Selected 3");

        }
        else if (V.getId() == R.id.two) {
            Log.i("Lizzy", "Selected 2");

        }
        else if (V.getId() == R.id.one) {
            Log.i("Lizzy", "Selected 1");

        }
    }
    //calculate string
    public double performOperation(String s){

    }
}