package com.test.calc.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.test.calc.R;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle bundle) {
        // TODO Auto-generated method stub
        super.onCreate(bundle);
        setContentView(R.layout.splash);

        Intent mainActivity = new Intent(this, CalculatorActivity.class);
        startActivity(mainActivity);
    }
}