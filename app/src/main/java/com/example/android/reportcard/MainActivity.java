package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dnj on 9/27/16.
 */

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_report);

        ArrayList<ReportCard> grade = new ArrayList<ReportCard>();

        grade.add(new ReportCard("English 101","A"));
        grade.add(new ReportCard("Math 202","A"));
        grade.add(new ReportCard("History 303","A"));
        grade.add(new ReportCard("Science 404","A"));
        grade.add(new ReportCard("Art 505","A"));

        GradesAdapter adapter = new GradesAdapter(this, grade);
        ListView listView = (ListView) findViewById(R.id.view_report);
        listView.setAdapter(adapter);

        TextView nameView = (TextView) findViewById(R.id.name);
        final String name = "Ray Finkle";
        nameView.setText(name);

        TextView yearView = (TextView) findViewById(R.id.year);
        final String year = "2016";
        yearView.setText(year);

        TextView termView = (TextView) findViewById(R.id.term);
        final String term = "Spring";
        termView.setText(term);

        TextView majorView = (TextView) findViewById(R.id.major);
        final String major = "Porpoise Theft Management";
        majorView.setText(major);
    }


}
