package com.lastmile.lastmileproto.resident;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.lastmile.lastmileproto.R;

public class ResidentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resident);
        //edit to reflect page transitions
        Button button_tutorialback = findViewById(R.id.button_tutorialback);
        button_tutorialback.setOnClickListener(view -> {
            Intent TutorialToActivityResident = new Intent(this,ResidentActivity.class);
            startActivity(TutorialToActivityResident);

        Button button_tutoriallogout = findViewById(R.id.button_tutoriallogout);
        button_tutoriallogout.setOnClickListener(view -> {
            Intent TutorialToMainLogin = new Intent(this,ResidentActivity.class);
            startActivity(TutorialToMainLogin);

        Button button_residenttutorial = findViewById(R.id.button_residenttutorial);
        button_residenttutorial.setOnClickListener(view -> {
               Intent ActivityResidenttoTutorial = new Intent(this,ResidentActivity.class);
               startActivity(ActivityResidenttoTutorial);

        Button button_residentlogout = findViewById(R.id.button_residentlogout);
        button_residentlogout.setOnClickListener(view -> {
                Intent ActivityResidentToMainLogin = new Intent(this, ResidentActivity.class);
                startActivity(ActivityResidentToMainLogin);
    }
}