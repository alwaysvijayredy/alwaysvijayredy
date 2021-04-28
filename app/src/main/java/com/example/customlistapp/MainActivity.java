package com.example.customlistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Integer allimages[]= {
        R.mipmap.ic_launcher,
        R.mipmap.ic_launcher,
        R.mipmap.ic_launcher,
        R.mipmap.ic_launcher,
        R.mipmap.ic_launcher,
        R.mipmap.ic_launcher,

};
String alltitle[]={"One","Two","Three","Four","Five","Six"};


ListView listView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        listView=(ListView)findViewById (R.id.List);

        MyListAdapter adapter=new MyListAdapter (MainActivity.this,alltitle,allimages);
        listView.setAdapter (adapter);
listView.setOnItemClickListener (new AdapterView.OnItemClickListener () {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText (MainActivity.this, ""+ alltitle[i], Toast.LENGTH_LONG).show ();
    }
});


    }
}