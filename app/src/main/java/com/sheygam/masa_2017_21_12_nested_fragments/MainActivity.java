package com.sheygam.masa_2017_21_12_nested_fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.activity_root_container,new MainFragment())
                .commit();
    }

    @Override
    public void onClickButtonNext() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activity_root_container,new ViewPagerFragment())
                .addToBackStack(null)
                .commit();
    }
}
