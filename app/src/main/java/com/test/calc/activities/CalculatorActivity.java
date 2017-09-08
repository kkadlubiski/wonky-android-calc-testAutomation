package com.test.calc.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.test.calc.R;

import java.math.BigDecimal;

public class CalculatorActivity extends Activity {

    BigDecimal result = BigDecimal.ZERO;
    Button add, subtract;
    TextView title, resultAmount, sqrt, divide, multiply, power;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        title = (TextView) findViewById(R.id.title);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        sqrt = (TextView) findViewById(R.id.sqrt);
        divide = (TextView) findViewById(R.id.divide);
        multiply = (TextView) findViewById(R.id.multiply);
        power = (TextView) findViewById(R.id.power);
        resultAmount = (TextView) findViewById(R.id.result);

        title.setText("Wonky calculator app");

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                result = result.add(BigDecimal.ONE);
                resultAmount.setText("Result: " + result.toString());
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                result = result.subtract(BigDecimal.ONE);
                resultAmount.setText("Result: " + result.toString());
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                result = new BigDecimal(Math.sqrt(result.doubleValue()));
                resultAmount.setText("Result: " + result.toString());
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                result = result.divide(new BigDecimal("2.0"));
                resultAmount.setText("Result: " + result.toString());
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                result = result.multiply(new BigDecimal(2));
                resultAmount.setText("Result: " + result.toString());
            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                BigDecimal targetNumber = result;
                for (int res = 0; res < targetNumber.intValue(); res++) {
                    result = result.add(targetNumber);
                }
                resultAmount.setText("Result: " + result.toString());
            }
        });
    }
}