package com.sf.itsp_agent.views;

import android.support.v4.app.Fragment;

import com.sf.itsp_agent.views.fragments.MarketFragment;
import com.sf.itsp_agent.views.fragments.SettingFragment;
import com.sf.itsp_agent.views.fragments.TaskFragment;

public enum TabType {
    Market("需求市场") {
        @Override
        public Fragment generation() {
            return new MarketFragment();
        }
    }, Tasks("我的任务") {
        @Override
        public Fragment generation() {
            return new TaskFragment();
        }
    }, Settings("设置") {
        @Override
        public Fragment generation() {
            return new SettingFragment();
        }
    };

    public final String title;

    TabType(String title) {
        this.title = title;
    }

    public abstract Fragment generation();
}
