package com.example.android.reportcard;

/**
 * Created by dnj on 9/27/16.
 */

public class ReportCard {


    // States
    private String mClassName;
    private String mGrade;



    // Constructor
    public ReportCard(String className, String grade){

        mClassName = className;
        mGrade = grade;
    }

    // Methods

    public String getmClassName() {
        return mClassName;
    }

    public String getmGrade() {
        return mGrade;
    }


    public void setEnglishGrade(String newGrade){
        mGrade = newGrade;
    }



    @Override
    public String toString() {
        return "ReportCard{" +
                "mClassName='" + mClassName + '\'' +
                ", mGrade='" + mGrade + '\'' +
                '}';

    }

}
