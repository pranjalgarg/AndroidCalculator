package com.example.mycalculator;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;
import android.widget.Switch;

public class MainActivity extends Activity implements OnClickListener{

	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
	TextView txt;
	String n1, n2;
	int count=1;
	float num1, num2, result;
	int x ;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.textView1);
		b1 = (Button) findViewById(R.id.bt1);
		b2 = (Button) findViewById(R.id.bt2);
		b3 = (Button) findViewById(R.id.bt3);
		b4 = (Button) findViewById(R.id.bt4);
		b5 = (Button) findViewById(R.id.bt5);
		b6 = (Button) findViewById(R.id.bt6);
		b7 = (Button) findViewById(R.id.bt7);
		b8 = (Button) findViewById(R.id.bt8);
		b9 = (Button) findViewById(R.id.bt9);
		b10 = (Button) findViewById(R.id.bt10);
		b11 = (Button) findViewById(R.id.bt11);
		b12 = (Button) findViewById(R.id.bt12);
		b13 = (Button) findViewById(R.id.bt13);
		b14 = (Button) findViewById(R.id.bt14);
		b15 = (Button) findViewById(R.id.bt15);
		b16 = (Button) findViewById(R.id.bt16);
		b17 = (Button) findViewById(R.id.bt17);
		b18= (Button) findViewById(R.id.bt18);
		b19 = (Button) findViewById(R.id.bt19);
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
		b8.setOnClickListener(this);
		b9.setOnClickListener(this);
		b10.setOnClickListener(this);
		b11.setOnClickListener(this);
		b12.setOnClickListener(this);
		b13.setOnClickListener(this);
		b14.setOnClickListener(this);
		b15.setOnClickListener(this);
		b16.setOnClickListener(this);
		b17.setOnClickListener(this);
		b18.setOnClickListener(this);
		b19.setOnClickListener(this);
	
       
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId())
		{
		case R.id.bt1: 
			txt.setText("");
			break;
		case R.id.bt2:
			break;
		case R.id.bt3: 
			break;
		case R.id.bt4:
			count = 0; 
			num1 = Float.parseFloat(txt.getText().toString());
			txt.setText("");
			count ++;
			x = 4;
			break;
		case R.id.bt5: 
			if (count != 0)
			{
				n1 = b5.getText().toString();
				txt.append(n1);
				count++;
			}
			break;
		case R.id.bt6: 
			if (count != 0)
			{
				n1 = b6.getText().toString();
				txt.append(n1);
				count++;
			}
			break;
		case R.id.bt7:
			if (count != 0)
			{
				n1 = b7.getText().toString();
				txt.append(n1);
				count++;
			}
			break;			
		case R.id.bt8:
			count = 0; 
			num1 = Float.parseFloat(txt.getText().toString());
			txt.setText("");
			count ++;
			x = 3;
		break;
		case R.id.bt9:
			if (count != 0)
			{
				n1 = b9.getText().toString();
				txt.append(n1);
				count++;
			}
			break;
		case R.id.bt10:
			if (count != 0)
			{
				n1 = b10.getText().toString();
				txt.append(n1);
				count++;
			}
			break;
		case R.id.bt11:
			if (count != 0)
			{
				n1 = b11.getText().toString();
				txt.append(n1);
				count++;
			}
			break;
		case R.id.bt12:
			count = 0; 
			num1 = Float.parseFloat(txt.getText().toString());
			txt.setText("");
			count ++;
			x = 2;
			break;
		case R.id.bt13: 
			if (count != 0)
			{
				n1 = b13.getText().toString();
				txt.append(n1);
				count++;
			}
			break;
		case R.id.bt14: 
			if (count != 0)
			{
				n1 = b14.getText().toString();
				txt.append(n1);
				count++;
			}
			break;
		case R.id.bt15: 
			if (count != 0)
			{
				n1 = b15.getText().toString();
				txt.append(n1);
				count++;
			}
			break;
		case R.id.bt16: 
			count = 0; 
			num1 = Float.parseFloat(txt.getText().toString());
			txt.setText("");
			count ++;
			x = 1;
			break;
		case R.id.bt17: 
			if (count != 0)
			{
				n1 = b17.getText().toString();
				txt.append(n1);
				count++;
			}
		break;
		case R.id.bt18: 
			if (count != 0)
			{
				n1 = b18.getText().toString();
				txt.append(n1);
				count++;
			}
		break;
		case R.id.bt19:
				switch (x)
				{
					case 1 :
						num2 = Float.parseFloat(txt.getText().toString());
						txt.setText("");
						result = num1 + num2;
						txt.setText(""+result);
					break;
					case 2 :
						num2 = Float.parseFloat(txt.getText().toString());
						txt.setText("");
						result = num1 - num2;
						txt.setText(""+result);
					break;
					case 3 :
						num2 = Float.parseFloat(txt.getText().toString());
						txt.setText("");
						result = num1 * num2;
						txt.setText(""+result);
					break;
					case 4 :
						num2 = Float.parseFloat(txt.getText().toString());
						txt.setText("");
						result = num1 / num2;
						txt.setText(""+result);
					break;
				}
			break;
	
		}
		
	}
	
}


