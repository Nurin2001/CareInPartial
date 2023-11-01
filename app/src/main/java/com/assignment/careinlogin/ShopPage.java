package com.assignment.careinlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ShopPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_page);

        //recyclerview for you item
        List<ShopItemPage> fyiDetails = getFYItemList();

        ForYouItemAdapter adapter = new ForYouItemAdapter(fyiDetails, this);

        RecyclerView fyiRecycler = findViewById(R.id.for_you_recycler);
        fyiRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        fyiRecycler.setAdapter(adapter);
    }

    private List<ShopItemPage> getFYItemList() {

        List<ShopItemPage> fyiDetails = new ArrayList<>();
        fyiDetails.add(new ShopItemPage("Item 1", 5.0, R.drawable.pharmacy1));
        fyiDetails.add(new ShopItemPage("Item 2", 5.00, R.drawable.pharmacy2));
        return fyiDetails;
    }
}