package com.example.joanvil.joanvaliente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    private RecyclerView backend_views;
    private Button showListBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showListBtn = findViewById(R.id.showListBtn);

        //backend_views = findViewById(R.id.backend_views);
        //backend_views.setLayoutManager(new LinearLayoutManager(this));
        //backend_views.setAdapter(adapter);
    }

    public void onClickShowList(View view){
        startActivity(new Intent(MainActivity.this, ListActivity.class));
        finish();
    }
}
