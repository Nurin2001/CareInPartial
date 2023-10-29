package com.assignment.careinlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        HelpMeBuyFragment helpMeBuyFragment = new HelpMeBuyFragment();
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.fragment_container, helpMeBuyFragment);
//        transaction.addToBackStack(null); // Optional, for back navigation

        // Get a reference to the FragmentManager
        androidx.fragment.app
                .FragmentManager fragmentManager
                = getSupportFragmentManager();

        // Start a new FragmentTransaction
        androidx.fragment.app
                .FragmentTransaction fragmentTransaction
                = fragmentManager.beginTransaction();

        // Replace the current fragment with the new
        // fragment
        fragmentTransaction.replace(R.id.frame_layout, new HelpMeBuyFragment());
        fragmentTransaction.commit();
    }
}