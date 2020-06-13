package com.example.startnglogistics;

import android.app.Activity;

import androidx.annotation.NonNull;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirebaseUtils {
    public static FirebaseDatabase mFirebaseDatabase;
    public static DatabaseReference mDatabaseReference;
    private static FirebaseUtils firebaseUtils;
    public static FirebaseAuth mFirebaseAuth;
    public static FirebaseAuth.AuthStateListener mAuthListener;
    public static ArrayList<ShipmentDeal> mDeals;

    private FirebaseUtils() { }

    public static void openFBReference(String ref){

        if (firebaseUtils == null) {
            firebaseUtils = new FirebaseUtils();
            mFirebaseDatabase = FirebaseDatabase.getInstance();
            mDatabaseReference = mFirebaseDatabase.getReference();



            mDeals = new ArrayList<ShipmentDeal>();
        }

        mDatabaseReference = mFirebaseDatabase.getReference().child(ref);

    }

    public static void attachListener(){

        mFirebaseAuth.addAuthStateListener(mAuthListener);
    }

    public static void detachListener(){

        mFirebaseAuth.removeAuthStateListener(mAuthListener);
    }
}
