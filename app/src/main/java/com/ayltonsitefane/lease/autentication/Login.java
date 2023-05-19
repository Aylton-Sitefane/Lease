package com.ayltonsitefane.lease.autentication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ayltonsitefane.lease.databinding.ActivityLoginBinding;
import com.ayltonsitefane.lease.home.Home;

public class Login extends AppCompatActivity {


    ActivityLoginBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        bind.entrarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, Home.class));
            }
        });
        bind.cliqueRecover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, RecoverAccountFragment.class));
            }
        });
    }
}