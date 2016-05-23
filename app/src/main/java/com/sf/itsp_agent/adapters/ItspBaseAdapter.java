package com.sf.itsp_agent.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.Collections;
import java.util.List;

public abstract class ItspBaseAdapter<T extends View, E> extends BaseAdapter {
    protected List<E> items = Collections.emptyList();
    protected Context context;

    public ItspBaseAdapter(Context context) {
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        T view;

        if (convertView == null) {
            view = buildView(parent);
        } else {
            view = (T) convertView;
        }

        updateView(view, position);

        return view;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public E getItem(int position) {
        return items.get(position);
    }

    protected abstract void updateView(T view, int position);

    protected abstract T buildView(ViewGroup parent);

    public void setItems(List<E> items) {
        this.items = items;
        notifyDataSetChanged();
    }
}