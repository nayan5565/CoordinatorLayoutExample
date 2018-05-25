package com.example.nayan.coordinatorlayoutexample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TabActivity extends AppCompatActivity {
    public static int selectTabPos;
    public static TabLayout footerTab;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ViewPager viewPager;
    private AdFooterTab adapterFooter;
    private ImageView imgMenu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        init();
//        setupNavigation();
        setupFooter();
    }

    private void init() {
//        NestedScrollView scrollView = (NestedScrollView) findViewById (R.id.nest_scrollview);
//        scrollView.setFillViewport (true);
//        imgMenu = (ImageView) findViewById(R.id.imgMenu);
//        imgMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
//        navigationView = (NavigationView) findViewById(R.id.navigationView);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        footerTab = (TabLayout) findViewById(R.id.footerTab);

    }

    private void setupNavigation() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                drawerLayout.closeDrawers();
                switch (menuItem.getItemId()) {
                    case R.id.mnuHome:
                        footerTab.getTabAt(0).select();
                        break;
                }
                return true;
            }
        });

    }

    private void setupFooter() {
        adapterFooter = new AdFooterTab(getSupportFragmentManager());
        adapterFooter.addFragment(FragHomePage.newInstance(), "Home");
        viewPager.setAdapter(adapterFooter);
        footerTab.setupWithViewPager(viewPager);
        footerTab.addTab(footerTab.newTab().setText("Tab"));
        footerTab.setSelectedTabIndicatorHeight(0);
        footerTab.setTabTextColors(Color.WHITE,Color.GREEN);


        footerTab.getTabAt(selectTabPos).select();
        footerTab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {


                viewPager.setCurrentItem(tab.getPosition());
                footerTab.setTabTextColors(Color.WHITE, Color.GREEN);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}
