package com.example.rvdatamodeldani;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listdata[] mylistdata = new listdata[] {
                new listdata("Nama   :   Dani Kurniadi"),
                new listdata("Kelas  :   TIF RM 20"),
                new listdata("NPM    :   20552011218"),
                new listdata("Kampus :   Sekolah Tinggi teknologi Bandung"),
                new listdata("Lokasi :   Bandung"),
                new listdata("Negara :   Indonesia"),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        listadapter adapter = new listadapter(mylistdata);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}