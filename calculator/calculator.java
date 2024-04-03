package com.Calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends Activity {
	EditText box;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,beql,bclr;
	double num1,num2,result;
	String option;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        box=(EditText)findViewById(R.id.editText1);
        
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b0=(Button)findViewById(R.id.button10);
        
        badd=(Button)findViewById(R.id.BPlus);
        bsub=(Button)findViewById(R.id.BMinus);
        bmul=(Button)findViewById(R.id.BStar);
        bdiv=(Button)findViewById(R.id.BSlash);
        beql=(Button)findViewById(R.id.BEqual);
        bclr=(Button)findViewById(R.id.button11);
        
        b1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				box.append("1");
			}
		});
        b2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				box.append("2");
			}
		});
        b3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				box.append("3");
			}
		});
        b4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				box.append("4");
			}
		});
        b5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				box.append("5");
			}
		});
        b6.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				box.append("6");
			}
		});
        b7.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				box.append("7");
			}
		});
        b8.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				box.append("8");
			}
		});
        b9.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				box.append("9");
			}
		});
        b0.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				box.append("0");
			}
		});
        badd.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				num1=Double.parseDouble(box.getText().toString());
				box.setText("");
				option="+";
				}
		});
        bsub.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				num1=Double.parseDouble(box.getText().toString());
				box.setText("");
				option="-";
				}
		});
        bmul.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				num1=Double.parseDouble(box.getText().toString());
				box.setText("");
				option="*";
				}
		});
        bdiv.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				num1=Double.parseDouble(box.getText().toString());
				box.setText("");
				option="/";
				}
		});
        beql.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(option.equals("+"))
				{
					num2=Double.parseDouble(box.getText().toString());
					result=num1+num2;
					box.setText(String.valueOf(result));
				}
				if(option.equals("-"))
				{
					num2=Double.parseDouble(box.getText().toString());
					result=num1-num2;
					box.setText(String.valueOf(result));
				}
				if(option.equals("*"))
				{
					num2=Double.parseDouble(box.getText().toString());
					result=num1*num2;
					box.setText(String.valueOf(result));
				}
				if(option.equals("/"))
				{
					num2=Double.parseDouble(box.getText().toString());
					if(num2==0)
					{
						box.setText("Zero Division Error");
					}
					else
					{
						result=num1/num2;
						box.setText(String.valueOf(result));
					}
				}
			}
		});
        bclr.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				num1=0;
				num2=0;
				result=0;
				box.setText("");
			}
		});
    }
}
