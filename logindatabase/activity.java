package com.hh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class login extends Activity {
    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

        Button b11, b22;
        b11 = findViewById(R.id.Save);
        b11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Perform actions when the "Save" button is clicked
                // For now, just show a toast message
                Toast.makeText(login.this, "Data Saved", Toast.LENGTH_SHORT).show();
            }
        });

        b22 = findViewById(R.id.first);
        b22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Navigate back to the HhActivity when the "Home" button is clicked
                Intent in = new Intent(login.this, HhActivity.class);
                startActivity(in);
            }
        });
    }
}
