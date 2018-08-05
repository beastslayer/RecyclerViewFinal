package com.example.bhavi.recyclerviewfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recMain;
    private RecyclerView.LayoutManager layoutmng;
    private ProductAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recMain=findViewById(R.id.RecyclerMainAC);
        recMain.setHasFixedSize(true);
        recMain.setLayoutManager(new LinearLayoutManager(this));
    }
}
