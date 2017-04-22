package com.example.deleting.bookticketcgv.screens;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.deleting.bookticketcgv.R;
import com.example.deleting.bookticketcgv.adapters.MainPagerAdapter;
import com.gigamole.navigationtabstrip.NavigationTabStrip;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.vp_main);
        viewPager.setAdapter(new MainPagerAdapter(getSupportFragmentManager()));
        viewPager.setOffscreenPageLimit(2);

        final NavigationTabStrip navigationTabStrip = (NavigationTabStrip) findViewById(R.id.nts);
        navigationTabStrip.setTitles("Đang Chiếu", "Sắp Chiếu");
        navigationTabStrip.setViewPager(viewPager);
    }
}
