package com.ray.sauvik.listviewexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class StudentListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Students> mStudentList;

    public StudentListAdapter(Context mContext, List<Students> mStudentList) {
        this.mContext = mContext;
        this.mStudentList = mStudentList;
    }

    @Override
    public int getCount() {
        return mStudentList.size();
    }

    @Override
    public Object getItem(int i) {
        return mStudentList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(mContext, R.layout.item_student_list, null);
        TextView student_name = v.findViewById(R.id.student_name);
        TextView student_id = v.findViewById(R.id.student_id);
        TextView student_major = v.findViewById(R.id.student_major);

        student_name.setText(mStudentList.get(i).getName());
        student_id.setText(String.valueOf(mStudentList.get(i).getStudentId()) + "Id");
        student_major.setText(String.valueOf(mStudentList.get(i).getMajor()));

        v.setTag(mStudentList.get(i).getStudentId());
        return v;
    }
}
