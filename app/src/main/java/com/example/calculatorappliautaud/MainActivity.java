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

    String operations = "";
    public void numSelected(View V) {
        TextView answer = findViewById(R.id.answer);
        //when you click on a button that operation is added to the string and at the end that
        // string is evaluated
        if (V.getId() == R.id.equals){
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
        else if (V.getId() == R.id.times) {
            Log.i("Lizzy", "Selected divide");
            operations += "x";
            answer.setText(operations);

        }
        else if (V.getId() == R.id.plus) {
            Log.i("Lizzy", "Selected divide");
            operations += "+";
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
        else if (V.getId() == R.id.zero) {
            Log.i("Lizzy", "Selected 0");
            operations += "0";
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
        while(isNumeric(s.substring(0, i +1)) && i < s.length() - 1){
            finalAnswer = parseDouble(s.substring(i, i +1));
            i++;
        }
        curOperator = s.charAt(i);

        //from the next character after the last num at index i, so i + 2, to the index + j
        if(isNumeric(s.substring(i + 1))){
            nextNumber = parseDouble(s.substring(i + 1));
            if(curOperator == '/'){
                finalAnswer = finalAnswer / nextNumber;
            }
            else if(curOperator == '-'){
                finalAnswer = finalAnswer - nextNumber;
            }
            else if(curOperator == '+'){
                finalAnswer = finalAnswer + nextNumber;
            }
            else if(curOperator == 'x'){
                finalAnswer = finalAnswer * nextNumber;
            }
            else if(curOperator == '%'){
                finalAnswer = finalAnswer % nextNumber;
            }
        }
        else {
            int j = i + 2;
            while (isNumeric(s.substring(i + 1, j)) && j < s.length() - 1) {
                nextNumber = parseDouble(s.substring(i + 2, j));
                j++;
            }
            if(curOperator == '/'){
                finalAnswer = finalAnswer / nextNumber;
            }
            else if(curOperator == '-'){
                finalAnswer = finalAnswer - nextNumber;
            }
            else if(curOperator == '+'){
                finalAnswer = finalAnswer + nextNumber;
            }
            else if(curOperator == 'x'){
                finalAnswer = finalAnswer * nextNumber;
            }
        }

        return finalAnswer;

    }


    public boolean isNumeric(String s) {
        if (s == null) {
            return false;
        }
        if(s.charAt(s.length() - 1) == '.') {
            return true;
        }
        try {
            double d = Double.parseDouble(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
        //documentation: https://www.baeldung.com/java-check-string-number
        // This uses a try-catch block to see if a number is parseable and, therefore, numeric
        //However, at the time of submission this is not working and crashes the app, do not know why,
        //I have tried other ways to check if a string is numeric with decimals and also crashed
    }//
}