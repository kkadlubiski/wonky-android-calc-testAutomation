package com.test.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.test.*;

public class CalculatorActivity extends Activity {
    /** Called when the activity is first created. */
	int count = 0;
	Button add ,sub;
	TextView display1 , display2 ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        add = (Button) findViewById(R.id.add_b);
        sub =(Button) findViewById(R.id.sub_b);
        display1 = (TextView) findViewById(R.id.tv1);
        display2 = (TextView) findViewById(R.id.tv2);
        
        
        
        
        
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			count++;
			display1.setText("Bravo ya islam");
			display2.setText("new number =" + count );
			}
		});
        
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				count--;
				display2.setText("new number =" + count );
				
			}
		});
    }
}