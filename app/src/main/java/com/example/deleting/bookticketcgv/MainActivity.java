package com.example.deleting.bookticketcgv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.deleting.bookticketcgv.adapters.MainPagerAdapter;
import com.gigamole.navigationtabstrip.NavigationTabStrip;



public class MainActivity extends AppCompatActivity {

    private Button btnDatVe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        btnDatVe = (Button) findViewById(R.id.btnDatVe);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.vp_main);
        viewPager.setAdapter(new MainPagerAdapter(getSupportFragmentManager()));
        viewPager.setOffscreenPageLimit(2);

        final NavigationTabStrip navigationTabStrip = (NavigationTabStrip) findViewById(R.id.nts);
        navigationTabStrip.setTitles("Đang Chiếu", "Sắp Chiếu");
        navigationTabStrip.setViewPager(viewPager);

        btnDatVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        DatVeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
