package com.sf.itsp_agent.views.fragments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sf.itsp_agent.R;
import com.sf.itsp_agent.adapters.TaskListViewAdapter;
import com.sf.itsp_agent.adapters.TaskListViewAdapter.TaskTypeSelection;

public class TaskSelectionItemView extends LinearLayout {
    private ImageView headerIcon;
    private TextView titleView;
    private ImageView indicatorView;

    public TaskSelectionItemView(Context context) {
        super(context);
        initUi();
    }

    public TaskSelectionItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initUi();
    }

    public TaskSelectionItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initUi();
    }

    private void initUi() {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View inflate = inflater.inflate(R.layout.task_fragment_item_view, this, true);

        headerIcon = (ImageView) inflate.findViewById(R.id.header_icon);
        titleView = (TextView) inflate.findViewById(R.id.title_view);
        indicatorView = (ImageView) inflate.findViewById(R.id.right_indicator);
    }

    public void setModel(TaskTypeSelection selection) {
        headerIcon.setImageResource(selection.icon);
        titleView.setText(selection.title);
        indicatorView.setImageResource(selection.indicator);
    }
}
