package com.example.nayan.coordinatorlayoutexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class IOActivityExample2 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_io_detail_2);
//
        Toolbar toolbar = (Toolbar) findViewById(R.id.ioexample_toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public static void start(Context c) {
        c.startActivity(new Intent(c, IOActivityExample2.class));
    }}
