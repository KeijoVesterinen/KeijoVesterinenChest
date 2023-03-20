package com.example.task8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textInput1;
    private EditText textInput2;
    private TextView textOutput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput1 = findViewById(R.id.textField1);
        textInput2 = findViewById(R.id.textField2);
        textOutput = findViewById(R.id.textView);

    }
    public void sumValues(View view){

        StringBuilder sb = new StringBuilder(textInput1.getText().toString());
        double value1 = Double.valueOf(sb.toString());
        //int value1 = Integer.valueOf(sb.toString());
        StringBuilder sb2 = new StringBuilder((textInput2.getText().toString()));
        //int value2 = Integer.valueOf(sb2.toString());
        double value2 = Double.valueOf(sb2.toString());
        //int sum = value1 + value2;
        double sum = value1 + value2;
        String result = String.valueOf(sum);
        textOutput.setText(result);
    }
    public void decreaseValues(View view){
        StringBuilder sb = new StringBuilder(textInput1.getText().toString());
        //int value1 = Integer.valueOf(sb.toString());
        double value1 = Double.valueOf(sb.toString());
        StringBuilder sb2 = new StringBuilder((textInput2.getText().toString()));
        //int value2 = Integer.valueOf((sb2.toString()));
        double value2 = Double.valueOf(sb2.toString());
        double sum = value1 - value2;
        String result = String.valueOf(sum);
        textOutput.setText(result);

    }
    public void multiplyValues(View view){
        StringBuilder sb = new StringBuilder(textInput1.getText().toString());
        //int value1 = Integer.valueOf(sb.toString());
        double value1 = Double.valueOf(sb.toString());
        StringBuilder sb2 = new StringBuilder((textInput2.getText().toString()));
        //int value2 = Integer.valueOf((sb2.toString()));
        double value2 = Double.valueOf(sb2.toString());
        double sum = value1 * value2;
        String result = String.valueOf(sum);
        textOutput.setText(result);
    }
    public void divideValues(View view){
        StringBuilder sb = new StringBuilder(textInput1.getText().toString());
        //int value1 = Integer.valueOf(sb.toString());
        double value1 = Double.valueOf(sb.toString());
        StringBuilder sb2 = new StringBuilder((textInput2.getText().toString()));
        //int value2 = Integer.valueOf((sb2.toString()));
        double value2 = Double.valueOf(sb2.toString());
        double sum = value1 / value2;
        String result = String.valueOf(sum);
        textOutput.setText(result);
    }
}