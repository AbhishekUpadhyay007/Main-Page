package com.example.uidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] menu = {
            "Deep bathroom cleaning ", "Protect your home against short circuits ", " 6 months guarantee on pest control "
            ,"Dr. Fix for all your plumbing needs ", "Summer ready ", "Hygienic products for body care "
    };

    int[] image = {
            R.drawable.bathroom, R.drawable.shortcircuit, R.drawable.pestcontrol, R.drawable.plumber, R.drawable.accleaning
            , R.drawable.bodycare
    };

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        MainAdapter adapter = new MainAdapter(MainActivity.this,image,  menu);
        gridView.setAdapter(adapter);

//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}