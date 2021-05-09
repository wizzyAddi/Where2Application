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

public class SignupTabFragment extends Fragment {
    TextView name, email, pass;
    Button register;
    float v = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);

        name = view.findViewById(R.id.name);
        email = view.findViewById(R.id.email);
        pass = view.findViewById(R.id.pass);
        register = view.findViewById(R.id.btnSignUp);

        name.setTranslationX(800);
        email.setTranslationX(800);
        pass.setTranslationX(800);
        register.setTranslationX(800);

        name.setAlpha(v);
        email.setAlpha(v);
        pass.setAlpha(v);
        register.setAlpha(v);

        name.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        register.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registration();
            }
        });

        return view;
    }

    public void registration() {
        // create the function/ methods that will take place once the user has entered their
        // registration data

        // once the user has entered their da, create a toast to confirm
    }
}
