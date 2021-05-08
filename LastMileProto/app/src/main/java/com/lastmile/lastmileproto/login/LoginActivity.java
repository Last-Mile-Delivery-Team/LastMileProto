package com.lastmile.lastmileproto.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lastmile.lastmileproto.R;
import com.lastmile.lastmileproto.resident.ResidentActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState){
        Button button_activitylogin = view.findViewById(R.id.button_residentlogin );
        button_activitylogin.setOnClickListener(activityLoginlistener -> {
            Intent i = new Intent(this, ResidentLogin.class);
            startActivity(i);

        });
    }
}