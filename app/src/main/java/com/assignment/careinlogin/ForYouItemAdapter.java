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

public class ForYouItemAdapter extends RecyclerView.Adapter<ForYouItemAdapter.RecyclerViewHolder>{

    public List<ShopItemPage> FYItemList;
    private Context context;

    public ForYouItemAdapter(List<ShopItemPage> FYItemList, Context context) {
        this.FYItemList = FYItemList;
        this.context = context;
    }

    @NonNull
    @Override
    public ForYouItemAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View pharmacyRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.for_you_row, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(pharmacyRow);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ForYouItemAdapter.RecyclerViewHolder holder, int position) {
        holder.fyiImg.setImageResource(FYItemList.get(position).getItemImg());
        holder.fyiName.setText(FYItemList.get(position).getItemName());
        holder.fyiPrice.setText("RM" + FYItemList.get(position).getItemPrice());
    }

    @Override
    public int getItemCount() {
        return FYItemList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView fyiName, fyiPrice;
        private ImageView fyiImg;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            fyiName = itemView.findViewById(R.id.fyi_name_tv);
            fyiPrice = itemView.findViewById(R.id.fyi_price_tv);
            fyiImg = itemView.findViewById(R.id.fyi_imgview);
        }
    }
}
