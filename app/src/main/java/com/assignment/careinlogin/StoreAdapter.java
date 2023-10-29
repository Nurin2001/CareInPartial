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

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.RecyclerViewHolder>{

    public List<StoreDetail> storeItemList;
    private Context context;

    public StoreAdapter(List<StoreDetail> storeItemList, Context context) {
        this.storeItemList = storeItemList;
        this.context = context;
    }

    @NonNull
    @Override
    public StoreAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View pharmacyRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.store_row, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(pharmacyRow);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StoreAdapter.RecyclerViewHolder holder, int position) {
        holder.storeImg.setImageResource(storeItemList.get(position).getStoreImg());
        holder.storeName.setText(storeItemList.get(position).getStoreName());
        holder.distance.setText(storeItemList.get(position).getDistance());
        holder.rating.setText(storeItemList.get(position).getRate());
    }

    @Override
    public int getItemCount() {
        return storeItemList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView storeName, distance, rating;
        private ImageView storeImg;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            storeName = itemView.findViewById(R.id.pharmacy_name_rec);
            distance = itemView.findViewById(R.id.pharmacy_distance_rec);
            rating = itemView.findViewById(R.id.pharmacy_rate_rec);
            storeImg = itemView.findViewById(R.id.pharmacy_img_rec);
        }
    }
}
