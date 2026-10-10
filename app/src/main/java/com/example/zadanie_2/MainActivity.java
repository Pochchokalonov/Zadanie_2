package com.example.zadanie_2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCars;
    private final ArrayList<String> carsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rvCars = findViewById(R.id.rv_cars);

        rvCars.setLayoutManager(
                new LinearLayoutManager(this)
        );

        loadData();

        CarsAdapters adapter = new CarsAdapters(carsList);

        rvCars.setAdapter(adapter);
    }

    private void loadData() {
        carsList.add("BMW M5");
        carsList.add("Mercedes-Benz E63 AMG");
        carsList.add("Audi RS7");
        carsList.add("Toyota Supra");
        carsList.add("Nissan Skyline GT-R");
        carsList.add("Lamborghini Aventador");
        carsList.add("Ferrari SF90");
        carsList.add("Porsche 911");
        carsList.add("Tesla Model S");
        carsList.add("Toyota Land Cruiser");
        carsList.add("Range Rover Sport");
        carsList.add("Ford Mustang");
        carsList.add("Chevrolet Camaro");
        carsList.add("Lexus LX 600");
        carsList.add("Bugatti Chiron");
    }
}
