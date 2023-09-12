package com.example.calculatorappliautaud;

import static java.lang.Double.parseDouble;

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
            operations = "" + performOperation(operations);
        }
        else if (V.getId() == R.id.clear) {
            Log.i("Lizzy", "Selected clear");
            answer.setText(" ");
            operations = "";
        }
        else if (V.getId() == R.id.decimal) {
            Log.i("Lizzy", "Selected decimal");
            operations += ".";
            answer.setText(operations);

        }
        else if (V.getId() == R.id.divide) {
            Log.i("Lizzy", "Selected divide");
            operations += "/";
            answer.setText(operations);

        }
        else if (V.getId() == R.id.minus) {
            Log.i("Lizzy", "Selected minus");
            operations += "-";
            answer.setText(operations);
        }
        else if (V.getId() == R.id.percent) {
            Log.i("Lizzy", "Selected percent");
            operations += "%";
            answer.setText(operations);
        }
        else if (V.getId() == R.id.nine) {
            Log.i("Lizzy", "Selected nine");
            operations += "9";
            answer.setText(operations);
        }
        else if (V.getId() == R.id.eight) {
            Log.i("Lizzy", "Selected 8");
            operations += "8";
            answer.setText(operations);

        }
        else if (V.getId() == R.id.seven) {
            Log.i("Lizzy", "Selected 7");
            operations += "7";
            answer.setText(operations);

        }
        else if (V.getId() == R.id.six) {
            Log.i("Lizzy", "Selected 6");
            operations += "6";
            answer.setText(operations);

        }
        else if (V.getId() == R.id.five) {
            Log.i("Lizzy", "Selected 5");
            operations += "5";
            answer.setText(operations);

        }
        else if (V.getId() == R.id.four) {
            Log.i("Lizzy", "Selected 4");
            operations += "4";
            answer.setText(operations);

        }
        else if (V.getId() == R.id.three) {
            Log.i("Lizzy", "Selected 3");
            operations += "3";
            answer.setText(operations);

        }
        else if (V.getId() == R.id.two) {
            Log.i("Lizzy", "Selected 2");
            operations += "2";
            answer.setText(operations);

        }
        else if (V.getId() == R.id.one) {
            Log.i("Lizzy", "Selected 1");
            operations += "1";
            answer.setText(operations);
        }
    }
    //calculate string
    public double performOperation(String s){
        //first run a loop to find the first number
        //then find the operator and convert it to its equivalent
        //then find the next number
        //the find the next operator
        //then keep doing this for the whole string
        double finalAnswer = 0;
        double nextNumber = 0;
        char curOperator;
        int i = 0;
        while(isNumeric(s.substring(0, i+1)) && i < s.length() - 1){
            finalAnswer = parseDouble(s.substring(0, i +1));
            i++;
        }
        int j = i + 2;
        while(isNumeric(s.substring(j)) && j < s.length() - 1){
            nextNumber = parseDouble(s.substring(j));
            j++;
        }
        curOperator = s.charAt(i + 1);
        if(curOperator == '/'){
            finalAnswer /= nextNumber;
        }

    }

    public boolean isNumeric(String s) {
        if(s.matches("-?\\d+(\\.\\d+)?")){
            return true;
        }
        else{
            return false;
        }
    }
}