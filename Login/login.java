package com.hh;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class HhActivity extends Activity {
 Button b1, b2;
 EditText ed1, ed2;
 /** Called when the activity is first created. */
 @Override
 public void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.main);
 ed1 = findViewById(R.id.un);
 ed2 = findViewById(R.id.pas);
 b1 = findViewById(R.id.login);
 b1.setOnClickListener(new View.OnClickListener() {
 public void onClick(View v) {
 if (ed1.getText().toString().equals("hi") && 
ed2.getText().toString().equals("mas")) {
 Toast.makeText(HhActivity.this, "Login Success",
 Toast.LENGTH_SHORT).show();
 } else {
 // If incorrect, show a toast message
 Toast.makeText(HhActivity.this, "Incorrect username or 
password",
 Toast.LENGTH_SHORT).show();
 }
 }
 });
 b2 = findViewById(R.id.cancel);
 b2.setOnClickListener(new View.OnClickListener() {
 public void onClick(View v) {
 finish();
 }
 });
 }
}
