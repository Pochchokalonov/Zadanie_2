package com.example.zadanie_2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarsAdapters extends RecyclerView.Adapter<CarsAdapters.CarsViewHolder> {

    private final ArrayList<String> carsList;

    public CarsAdapters(ArrayList<String> carsList) {
        this.carsList = carsList;
    }

    @NonNull
    @Override
    public CarsViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cars, parent, false);

        return new CarsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull CarsViewHolder holder, int position) {

        String car = carsList.get(position);
        holder.bind(car);
    }

    @Override
    public int getItemCount() {
        return carsList.size();
    }

    public static class CarsViewHolder extends RecyclerView.ViewHolder {

        private final TextView textView;

        public CarsViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.tv_cars);
        }

        public void bind(String car) {
            textView.setText(car);
        }
    }
}
