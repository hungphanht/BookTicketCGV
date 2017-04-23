package com.example.deleting.bookticketcgv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChiTietPhimActivity extends AppCompatActivity {

    private ImageView imgBack;
    private Button btnDatVe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitietphim);

        imgBack = (ImageView) findViewById(R.id.imgBack);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) { // TODO Auto-generated method stub
                Intent intent = new Intent(ChiTietPhimActivity.this,
                        MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
