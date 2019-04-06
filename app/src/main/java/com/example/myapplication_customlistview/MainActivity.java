package com.example.myapplication_customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication_customlistview.Adapter.List_Adapter;
import com.example.myapplication_customlistview.Modal.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lstStudentData;
    private ArrayList<Student> studentArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstStudentData = findViewById(R.id.lst1);
initData();

        List_Adapter mstudentAdapter = new List_Adapter(this, studentArrayList);
        lstStudentData.setAdapter(mstudentAdapter);
    }

    private void initData() {
        studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("1", "Pritesh", "India"));
        studentArrayList.add(new Student("2", "Samir", "India"));
        studentArrayList.add(new Student("3", "Mandeep", "Canada"));

    }
}