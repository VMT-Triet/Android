package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
    public void XULY(View view)
    {
        int id = view.getId();
        switch (id)
        {
            case R.id.register:
                Intent intent = new Intent( LoginActivity.this, CreateActivity.class);
                startActivity(intent);
                break;
            case R.id.login:
                Toast.makeText(this,"Bạn đã đăng nhập thành công!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}