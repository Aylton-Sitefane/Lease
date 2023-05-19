package com.ayltonsitefane.lease.autentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.ayltonsitefane.lease.R;
import com.ayltonsitefane.lease.databinding.ActivityRegisterBinding;

public class Register extends AppCompatActivity {

    ActivityRegisterBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        bind.possiContaTv.setOnClickListener(
                v ->{
                    startActivity(new Intent(Register.this, Login.class));
                }
        );
        bind.criarContaBtn.setOnClickListener(
                v ->{
                    startActivity(new Intent(Register.this, Login.class));
                }
        );
    }
}