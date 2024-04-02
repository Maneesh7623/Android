package com.cal;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class CalculatorActivity extends Activity {
 
EditText no1,no2;
TextView ans;
int num1,num2;
 @Override
 public void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.main);
 no1 = (EditText) findViewById(R.id.num1);
 no2 = (EditText) findViewById(R.id.num2);
 ans = (TextView) findViewById(R.id.ans);
 Button btnAdd = (Button) findViewById(R.id.add);
 Button btnSubtract = (Button) findViewById(R.id.sub);
 Button btnMultiply = (Button) findViewById(R.id.mul);
 Button btnDivide = (Button) findViewById(R.id.div);
 btnAdd.setOnClickListener(new View.OnClickListener() {
 public void onClick(View view) {
 performOperation('+');
 }
 });
 btnSubtract.setOnClickListener(new View.OnClickListener() {
 public void onClick(View view) {
 performOperation('-');
 }
 });
 btnMultiply.setOnClickListener(new View.OnClickListener() {
 
 public void onClick(View view) {
 performOperation('*');
 }
 });
 btnDivide.setOnClickListener(new View.OnClickListener() {
 
 public void onClick(View view) {
 performOperation('/');
 }
 });
 }
 private void performOperation(char operation) {
 String num1Str = no1.getText().toString();
 String num2Str = no2.getText().toString();
 if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
 double num1 = Double.parseDouble(num1Str);
 double num2 = Double.parseDouble(num2Str);
 double result = 0;
 switch (operation) {
 case '+':
 result = num1 + num2;
 break;
 case '-':
 result = num1 - num2;
 break;
 case '*':
 result = num1 * num2;
 break;
 case '/':
 if (num2 != 0) {
 result = num1 / num2;
 } else {
 ans.setText("Cannot divide by zero");
 return;
 }
 break;
 }
 ans.setText("Result: " + result);
 } else {
 ans.setText("Please enter valid numbers");
 }
 }
}
