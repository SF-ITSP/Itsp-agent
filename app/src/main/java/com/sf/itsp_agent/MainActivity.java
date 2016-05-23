package com.sf.itsp_agent;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.sf.itsp_agent.adapters.TabPageAdapter;
import com.viewpagerindicator.TabPageIndicator;

public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        TabPageIndicator indicatorView = (TabPageIndicator) findViewById(R.id.indicator_view);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        viewPager.setAdapter(new TabPageAdapter(getSupportFragmentManager()));
        indicatorView.setViewPager(viewPager);
    }
}
