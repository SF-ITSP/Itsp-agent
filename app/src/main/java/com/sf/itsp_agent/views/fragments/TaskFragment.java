package com.sf.itsp_agent.views.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.sf.itsp_agent.R;
import com.sf.itsp_agent.adapters.TaskListViewAdapter;

public class TaskFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.task_fragment, container, false);

        ListView taskListView = (ListView) inflate.findViewById(R.id.task_list_view);
        TaskListViewAdapter adapter = new TaskListViewAdapter(getActivity().getApplicationContext());
        taskListView.setAdapter(adapter);
        return inflate;
    }


}
