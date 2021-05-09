package com.example.where2application;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {
    TextView email, pass, forgotPass;
    Button login;
    float v = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        email = view.findViewById(R.id.email);
        pass = view.findViewById(R.id.pass);
        forgotPass = view.findViewById(R.id.tvForgot);
        login = view.findViewById(R.id.btnLogin);

        email.setTranslationX(800);
        pass.setTranslationX(800);
        forgotPass.setTranslationX(800);
        login.setTranslationX(800);

        email.setAlpha(v);
        pass.setAlpha(v);
        forgotPass.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgotPass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifyCredentials();
                enterHome();
            }
        });

        return view;
    }

    public void verifyCredentials(){
        // create verification method for the data  the user enters
    }

    public void enterHome() {
        Intent intent = new Intent(getActivity(), HomeActivity.class);
        startActivity(intent);
    }
}
