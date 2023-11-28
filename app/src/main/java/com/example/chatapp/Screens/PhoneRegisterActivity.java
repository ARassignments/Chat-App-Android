package com.example.chatapp.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.chatapp.R;
import com.example.chatapp.databinding.ActivityPhoneRegisterBinding;
import com.example.chatapp.databinding.ActivityWelcomeBinding;

public class PhoneRegisterActivity extends AppCompatActivity {

    ActivityPhoneRegisterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_register);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityPhoneRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PhoneRegisterActivity.super.onBackPressed();
            }
        });
        binding.btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PhoneRegisterActivity.this, VerifyOTPActivity.class));
            }
        });
    }
}