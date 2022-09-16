package com.evermine.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Locating the button by ID
        Button button = (Button) findViewById(R.id.button2);
        //Button onclick listener
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Showing a toast
                Context context = getApplicationContext();
                CharSequence text = "Test Toast!!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}