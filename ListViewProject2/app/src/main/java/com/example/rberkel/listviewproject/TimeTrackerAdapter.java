package com.example.rberkel.listviewproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.sql.Time;
import java.util.ArrayList;

/**
 * Created by rberkel on 13-10-2016.
 */

public class TimeTrackerAdapter extends BaseAdapter {

    private ArrayList<TimeRecord> times = new ArrayList<TimeRecord>();
    public TimeTrackerAdapter() {
        times.add(new TimeRecord(
                "38:23", "Feeling good!"));
        times.add(new TimeRecord(
                "49:01", "Tired. Needed more caffeine"));
        times.add(new TimeRecord(
                "26:21", "I’m rocking it!"));
        times.add(new TimeRecord(
                "29:42", "Lost some time on the hills, but pretty good."));
    }

    @Override
    public int getCount() {
        return times.size();
    }

    @Override
    public Object getItem(int position) {
        return getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.timerecord, parent, false);
        }
        TimeRecord time = times.get(position);

        TextView timeTextView = (TextView)convertView.findViewById(R.id.time_view);
        timeTextView.setText(time.getTime());

        TextView notesTextView = (TextView)convertView.findViewById(R.id.notes_view);
        notesTextView.setText(time.getNotes());

        return convertView;
    }
}
