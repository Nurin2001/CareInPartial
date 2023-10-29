package com.assignment.careinlogin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PharmacyAdapter extends RecyclerView.Adapter<PharmacyAdapter.RecyclerViewHolder>{

    public List<PharmacyDetail> pharmacyItemList;
    private Context context;

    public PharmacyAdapter(List<PharmacyDetail> pharmacyItemList, Context context) {
        this.pharmacyItemList = pharmacyItemList;
        this.context = context;
    }

    @NonNull
    @Override
    public PharmacyAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View pharmacyRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.pharmacy_row, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(pharmacyRow);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PharmacyAdapter.RecyclerViewHolder holder, int position) {
        holder.pharmacyImg.setImageResource(pharmacyItemList.get(position).getPharmacyImg());
        holder.pharmacyName.setText(pharmacyItemList.get(position).getPharmacyName());
        holder.distance.setText(pharmacyItemList.get(position).getDistance());
        holder.rating.setText(pharmacyItemList.get(position).getRate());
    }

    @Override
    public int getItemCount() {
        return pharmacyItemList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView pharmacyName, distance, rating;
        private ImageView pharmacyImg;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            pharmacyName = itemView.findViewById(R.id.pharmacy_name_rec);
            distance = itemView.findViewById(R.id.pharmacy_distance_rec);
            rating = itemView.findViewById(R.id.pharmacy_rate_rec);
            pharmacyImg = itemView.findViewById(R.id.pharmacy_img_rec);
        }
    }
}
