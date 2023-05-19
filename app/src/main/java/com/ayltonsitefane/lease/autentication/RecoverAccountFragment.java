package com.ayltonsitefane.lease.autentication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ayltonsitefane.lease.R;
import com.google.android.material.button.MaterialButton;


public class RecoverAccountFragment extends Fragment {

   TextView tryAnother;
   MaterialButton btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=  inflater.inflate(R.layout.fragment_recover_account, container, false);
        tryAnother = v.findViewById(R.id.try_another_tv);
        btn = v.findViewById(R.id.proximo_btn);
        ConfirmationRecoverAccountFragment recoverAccountFragment = new ConfirmationRecoverAccountFragment();

        tryAnother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.frame_layout, recoverAccountFragment);
            }
        });



        return v;
    }



}