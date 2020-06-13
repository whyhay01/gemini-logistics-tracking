package com.example.startnglogistics;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class UserHomeAdapter extends RecyclerView.Adapter<UserHomeAdapter.UserAdapterViewHolder> {
    private ArrayList<ShipmentDeal> deals;
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mDatabaseReference;
    private ChildEventListener mChildEventListener;

    public UserHomeAdapter(){
        FirebaseUtils.openFBReference("shipmentdeals");
        mFirebaseDatabase = FirebaseUtils.mFirebaseDatabase;
        mDatabaseReference = FirebaseUtils.mDatabaseReference;
        deals = FirebaseUtils.mDeals;

        mChildEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                ShipmentDeal sd = dataSnapshot.getValue(ShipmentDeal.class);
                Log.d(TAG, "Deal: "+ sd.getShipmentStatus());
                //sd.setId(dataSnapshot.getKey());
                deals.add(sd);
                notifyItemInserted(deals.size()-1);

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        mDatabaseReference.addChildEventListener(mChildEventListener);
    }


    @NonNull
    @Override
    public UserAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.activity_insert,parent, false);

        return new UserAdapterViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapterViewHolder holder, int position) {
        ShipmentDeal deal = deals.get(position);
        holder.bindView(deal);

    }

    @Override
    public int getItemCount() {

        return deals.size();
    }

    public class UserAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView tvTrackingID, tvOrigin, tvDestination, tvShippedOn;

        public UserAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTrackingID = itemView.findViewById(R.id.id_number);
            tvOrigin = itemView.findViewById(R.id.orig_add);
            tvDestination = itemView.findViewById(R.id.dest_add);
            tvShippedOn = itemView.findViewById(R.id.shipment_date);
        }

        public void bindView (ShipmentDeal deal){
            tvTrackingID.setText(deal.getId());
            tvOrigin.setText(deal.getShipFrom());
            tvDestination.setText(deal.getShipTo());
            tvShippedOn.setText(deal.getShippingDate());

        }
    }
}
