package com.lastmile.lastmileproto.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.lastmile.lastmileproto.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button_courierlogin = findViewById(R.id.button_courierlogin);
        button_courierlogin.setOnClickListener(view -> {
            Intent MainLogtoCourierLog = new Intent(this, CourierLogin.class);
            startActivity(MainLogtoCourierLog);
        });

    }
}