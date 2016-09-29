package com.example.android.reportcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dnj on 9/27/16.
 */

public class GradesAdapter extends ArrayAdapter<ReportCard>{

    public GradesAdapter(Context context, ArrayList<ReportCard> grades){
        super(context,0,grades);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        ReportCard currentGrade = getItem(position);

        TextView classTextView = (TextView) listItemView.findViewById(R.id.class_text_view);
        classTextView.setText(currentGrade.getmClassName());


        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.grade_text_view);
        gradeTextView.setText(currentGrade.getmGrade());


        return listItemView;

    }




}
