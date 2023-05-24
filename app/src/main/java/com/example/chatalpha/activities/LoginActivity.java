package com.example.chatalpha.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chatalpha.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    private Button buttonLogin;
    private ActivityLoginBinding binding;

    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();


//        buttonLogin = findViewById(R.id.buttonLogin);
//
//        buttonLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Lógica para el inicio de sesión
//                Intent intent = new Intent(LoginActivity.this, ChatsActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });
    }

    private void setListeners(){
        binding.textCreateNewAccount.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class)));

    }
}
