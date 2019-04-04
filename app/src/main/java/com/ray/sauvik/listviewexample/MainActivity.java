package com.ray.sauvik.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvStudent;
    private StudentListAdapter adapter;
    private List<Students> mStudentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvStudent = findViewById(R.id.listView_student);

        mStudentList = new ArrayList<>();

        mStudentList.add(new Students("John", 123, "science"));
        mStudentList.add(new Students("Amy", 456, "Psychology"));
        mStudentList.add(new Students("Vicky", 345, "Computer science"));
        mStudentList.add(new Students("Dave", 167, "Astronomy"));
        mStudentList.add(new Students("Dalvick", 178, "Civil"));
        mStudentList.add(new Students("Andrew", 867, "Electronics"));
        mStudentList.add(new Students("Miang", 9875, "Mechanical"));
        mStudentList.add(new Students("Liala", 987, "Arts"));
        mStudentList.add(new Students("Aruba", 9876, "Sports"));
        mStudentList.add(new Students("Jasmin", 7654, "Medical"));

        adapter = new StudentListAdapter(getApplicationContext(), mStudentList);

        lvStudent.setAdapter(adapter);

        lvStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Clicked Student Id"  + view.getTag(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
