package com.example.exzam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    private EditText edit;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button = (Button) findViewById(R.id.button);
    }

    @Override
    public void onClick (View view) {
        switch (view.getId()){
            case R.id.button:
                edit = findViewById(R.id.edittext1);
                edit.setVisibility(View.VISIBLE);
                edit = findViewById(R.id.edittext2);
                edit.setVisibility(View.VISIBLE);
                break;
        }
    }
}