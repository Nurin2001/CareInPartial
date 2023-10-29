package com.assignment.careinlogin;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HelpMeBuyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_help_me_buy, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //recycler view pharmacy
        List<PharmacyDetail> pharmacyDetails = getPharmacyList();

        PharmacyAdapter adapter = new PharmacyAdapter(pharmacyDetails, getContext());

        RecyclerView pharmacyRecycler = view.findViewById(R.id.pharmacy_recycler);
        pharmacyRecycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        pharmacyRecycler.setAdapter(adapter);

        //recycler view store
        List<StoreDetail> storeDetails = getStoreList();

        StoreAdapter storeAdapter = new StoreAdapter(storeDetails, getContext());

        RecyclerView storeRecycler = view.findViewById(R.id.store_recycler);
        storeRecycler.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        storeRecycler.setAdapter(adapter);

    }

    private List<StoreDetail> getStoreList() {
        List<StoreDetail> storeDetails = new ArrayList<>();
        storeDetails.add(new StoreDetail("Store1", "5km", "3star", R.drawable.pharmacy1));
        storeDetails.add(new StoreDetail("Store 2", "5km", "3star", R.drawable.pharmacy2));
        return storeDetails;
    }

    private List<PharmacyDetail> getPharmacyList() {

        List<PharmacyDetail> pharmacyDetails = new ArrayList<>();
        pharmacyDetails.add(new PharmacyDetail("Pharmacy1", "5km", "3star", R.drawable.pharmacy1));
        pharmacyDetails.add(new PharmacyDetail("Pharmacy 2", "5km", "3star", R.drawable.pharmacy2));
        return pharmacyDetails;

    }
}