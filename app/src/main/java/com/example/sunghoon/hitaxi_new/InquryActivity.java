package com.example.sunghoon.hitaxi_new;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class InquryActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inqury);

        ListView listView = (ListView) findViewById(R.id.listview);

        ArrayList<ListViewItem> data = new ArrayList<>();
        ListViewItem lion = new ListViewItem( "공지사항");
        ListViewItem tiger = new ListViewItem("튜토리얼 다시보기");
        ListViewItem dog = new ListViewItem( "만든사람");
        ListViewItem cat = new ListViewItem("문의사항");
        ListViewItem tt = new ListViewItem("버전정보");

        data.add(lion);
        data.add(tiger);
        data.add(dog);
        data.add(cat);
        data.add(tt);


        ListViewAdapter adapter = new ListViewAdapter
                (this,R.layout.listview_item,data);
        listView.setAdapter(adapter);

    }
}
