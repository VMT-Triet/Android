package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateActivity extends AppCompatActivity {
    EditText user = findViewById(R.id.username);
    EditText pass = findViewById(R.id.password);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }
    public void XULY(View view)
    {
        int id = view.getId();
        switch (id)
        {
            case R.id.cancel:
                Intent intent = new Intent(CreateActivity.this,LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.sign:
                Intent intent1 = new Intent(CreateActivity.this,LoginActivity.class);
                String s = user.getText().toString().trim();
                intent1.putExtra("user",s);
                startActivity(intent1);
                break;
        }
    }
}