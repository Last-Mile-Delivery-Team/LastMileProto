package com.lastmile.lastmileproto.resident;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.lastmile.lastmileproto.R;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ResidentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resident);

        Button button_instupdate = findViewById(R.id.button_instUpdate);
        button_instupdate.setOnClickListener(instupdatelistener -> {
            Thread thread = new Thread(new Runnable() {

                @Override
                public void run() {
                    try  {
                        /*RequestBody formBody = new FormBody.Builder()
                                .add("Username", "alex.horejsi@gmail.com")
                                .add("Password", "123")
                                .build();*/
                        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                        String json = "{\"Username\": \"alex.horejsi@gmail.com\", \"Password\": \"123\"}";

                        RequestBody body = RequestBody.create(JSON, json);

                        Request request = new Request.Builder()
                                .url("http://192.168.1.161:5000/makeResident")
                                .post(body)
                                .build();
                        Response response = new OkHttpClient().newCall(request).execute();

                        if (!response.isSuccessful())
                            throw new IOException("Unexpected code " + response);

                        // Get response body
                        System.out.println(response.body().string());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            thread.start();
        });
    }
}