package com.example.where2application;
//NB: DO NOT EDIT THIS DOCUMENT
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentHolder, new HomeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener(){
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.navMap:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.favourite:
                            selectedFragment = new FavoriteFragment();
                            break;
                        case R.id.history:
                            selectedFragment = new HistoryFragment();
                            break;
                        case R.id.weather:
                            selectedFragment = new WeatherFragment();
                            break;
                        case R.id.userProfile:
                            selectedFragment = new ProfileFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentHolder, selectedFragment).commit();
                    return true;
                }
    };
}
//NB: DO NOT EDIT THIS DOCUMENT