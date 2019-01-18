package com.example.user.socialnetwork;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private RecyclerView rvAllUsersPostList;
    private View headerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
    }

    private void setInitialData() {
        initView();
    }

    private void initView() {
        drawerLayout = findViewById(R.id.dlMain);
        navigationView = findViewById(R.id.nvMenu);
        headerView = navigationView.inflateHeaderView(R.layout.navigation_header);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                userMenuSelector(item);
                return false;
            }
        });
    }

    private void userMenuSelector(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_post:
                Toast.makeText(this, "Post", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_profile:
                break;

            case R.id.nav_home:
                break;

            case R.id.nav_friends:
                break;

            case R.id.nav_find_friends:
                break;

            case R.id.nav_messages:
                break;

            case R.id.nav_settings:
                break;

            case R.id.nav_Logout:
                break;

            default:
                Toast.makeText(this, "Navigation menu error!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
