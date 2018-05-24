package com.example.nayan.coordinatorlayoutexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SimpleCoordinatorActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_coordinator);
    }

    public static void start(Context c) {
        c.startActivity(new Intent(c, SimpleCoordinatorActivity.class));
    }
}
