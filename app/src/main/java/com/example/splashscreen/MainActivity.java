package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private Button btn1, btn2, btn3;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                Intent intent = new Intent
                        (MainActivity.this, principal.class);

                startActivity(intent);
                Toast.makeText( this, "opcion1", Toast.LENGTH_SHORT). show();
                break;

        }
    }
}