package com.example.student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.student.Adapters.DataAdapter;
import com.example.student.Models.DataModel;
import com.example.student.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        ArrayList<DataModel> list = new ArrayList<>();
        list.add(new DataModel(R.id.view,"Class 1", "Today", "6pm"));
        list.add(new DataModel(R.id.view,"Class 1", "Today", "6pm"));
        list.add(new DataModel(R.id.view,"Class 1", "Today", "6pm"));
        list.add(new DataModel(R.id.view,"Class 1", "Today", "6pm"));
        list.add(new DataModel(R.id.view,"Class 1", "Today", "6pm"));

        DataAdapter dataAdapter = new DataAdapter(list, this);
        binding.recyclerView1.setAdapter(dataAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.recyclerView1.setLayoutManager(linearLayoutManager);
    }
}