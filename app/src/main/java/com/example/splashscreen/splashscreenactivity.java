package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class splashscreenactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreenactivity);
        Thread splashScreenStarter = new Thread() {
            public void run() {
                try {
                    int delay = 0;

                    while (delay < 2000) {
                        sleep(150);
                        delay = delay + 100;
                    }

                    Intent intent = new Intent(  splashscreenactivity.this,
                            MainActivity.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }
        };
        splashScreenStarter.start();
    }
}
