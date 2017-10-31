package com.example.user.lab12bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextWeight, editTextHeight;
    private Button buttonCalculate, buttonReset;
    private ImageView imageViewResult;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        editTextHeight = (EditText) findViewById(R.id.editTextHeight);

        buttonCalculate = (Button) findViewById(R.id.buttonCalculate);
        buttonReset = (Button) findViewById(R.id.buttonReset);

        imageViewResult = (ImageView) findViewById(R.id.imageViewResult);

        textViewResult = (TextView) findViewById(R.id.textViewResult);
    }

    public void calculate(View view){
        double weight, height, result;
        String type;

        weight = (Double.parseDouble(editTextWeight.getText().toString()));
        height = (Double.parseDouble(editTextHeight.getText().toString()));

        result = weight / (height * height);

        if (result <= 18.5){
            type = "Under Weight";
            textViewResult.setText(type);
            imageViewResult.setImageResource(R.drawable.under);
        }else if (result > 18.5 && result < 21){
            type = "Normal";
            textViewResult.setText(type);
            imageViewResult.setImageResource(R.drawable.normal);
        }else if (result > 21){
            type = "Over Weight";
            textViewResult.setText(type);
            imageViewResult.setImageResource(R.drawable.over);
        }else{

        }
    }

    public void reset(View view){
        editTextHeight.setText("");
        editTextWeight.setText("");
        imageViewResult.setImageResource(R.drawable.empty);
        textViewResult.setText("Result");
    }

}
