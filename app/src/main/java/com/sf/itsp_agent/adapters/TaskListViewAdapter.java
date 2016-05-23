package com.sf.itsp_agent.adapters;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.sf.itsp_agent.R;
import com.sf.itsp_agent.views.fragments.TaskSelectionItemView;

import java.util.Arrays;
import java.util.List;

import static com.sf.itsp_agent.adapters.TaskListViewAdapter.TaskTypeSelection.toList;

public class TaskListViewAdapter extends ItspBaseAdapter {
    public TaskListViewAdapter(Context context) {
        super(context);
        super.items = toList();
    }

    @Override
    protected void updateView(View view, int position) {
        ((TaskSelectionItemView) view).setModel(TaskTypeSelection.values()[position]);
    }

    @Override
    protected View buildView(ViewGroup parent) {
        return new TaskSelectionItemView(context);
    }

    public enum TaskTypeSelection {
        Unscheduled(R.drawable.sets, R.string.unscheduled, R.drawable.arrow),
        Executing(R.drawable.sets, R.string.unscheduled, R.drawable.arrow),
        Pending(R.drawable.sets, R.string.unscheduled, R.drawable.arrow);

        public final int icon;
        public final int title;
        public final int indicator;

        TaskTypeSelection(int icon, int title, int indicator) {
            this.icon = icon;
            this.title = title;
            this.indicator = indicator;
        }

        public static List toList() {
            return Arrays.asList(Unscheduled, Executing, Pending);
        }
    }
}
