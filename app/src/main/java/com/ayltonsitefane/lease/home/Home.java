package com.ayltonsitefane.lease.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.ayltonsitefane.lease.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    ActivityHomeBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());


        BottomNavigationView bottomNavigationView = bind.navMenu;
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_item:
                        HomeFragment fragment1 = new HomeFragment();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame_layout, fragment1)
                                .commit();
                        return true;
                    case R.id.nav_fav:
                        FavoritesFragment fragment2 = new FavoritesFragment();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame_layout, fragment2)
                                .commit();
                        return true;
                    case R.id.nav_notifications:
                        NotificationFragment fragment3 = new NotificationFragment();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame_layout, fragment3)
                                .commit();
                        return true;
                    case R.id.navigation_search:
                        SearchFragment fragment4 = new SearchFragment();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame_layout, fragment4)
                                .commit();
                        return true;
                    case R.id.navigation_profile:
                        ProfileFragment fragment5 = new ProfileFragment();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame_layout, fragment5)
                                .commit();
                        return true;

                }
                return false;
            }
        });
    }


}