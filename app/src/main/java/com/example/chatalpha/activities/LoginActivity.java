package com.example.chatalpha.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chatalpha.MainActivity;
import com.example.chatalpha.R;

public class LoginActivity extends AppCompatActivity {
    private Button continuarBoton;

    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        continuarBoton = findViewById(R.id.continuarBoton);

        continuarBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para el inicio de sesión
                Intent intent = new Intent(LoginActivity.this, ChatsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
