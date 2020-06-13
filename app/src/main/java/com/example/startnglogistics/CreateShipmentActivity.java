package com.example.startnglogistics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.zip.Inflater;

public class CreateShipmentActivity extends AppCompatActivity {

    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mDatabaseReference;
    EditText txtStatus;
    EditText txtShippingDate;
    EditText txtShipTo;
    EditText txtShipFrom;
    EditText txtCurrentLocation;
    EditText txtPreviousLocation;
    EditText txtArrivalDate;
    Button btnCreateShipment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_shipment);

        FirebaseUtils.openFBReference("shipmentdeals");
        mFirebaseDatabase = FirebaseUtils.mFirebaseDatabase;
        mDatabaseReference = FirebaseUtils.mDatabaseReference;

        //Create a reference to each of the EditText

        txtStatus = findViewById(R.id.txt_status);
        txtShippingDate = findViewById(R.id.txt_shipped_date);
        txtShipTo = findViewById(R.id.txt_ship_to);
        txtShipFrom = findViewById(R.id.txt_ship_from);
        txtCurrentLocation = findViewById(R.id.txt_current_loc);
        txtPreviousLocation = findViewById(R.id.txt_previous_loc);
        txtArrivalDate = findViewById(R.id.txt_expt_date_del);
        btnCreateShipment = findViewById(R.id.btn_create_shipment);

        btnCreateShipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveDeal();
                Toast.makeText(CreateShipmentActivity.this, "Shipment Created", Toast.LENGTH_SHORT).show();
                clean();
            }
        });
    }

    private void saveDeal() {
        String shipmentStatus =txtStatus.getText().toString();
        String shippingDate =txtShippingDate.getText().toString();
        String shipTo =txtShipTo.getText().toString();
        String shipFrom =txtShipFrom.getText().toString();
        String currentLocation =txtCurrentLocation.getText().toString();
        String previuosLocation =txtPreviousLocation.getText().toString();
        String arrivalDate =txtArrivalDate.getText().toString();
        String id =mDatabaseReference.push().getKey();

        ShipmentDeal shipmentDeal = new ShipmentDeal( id,shipmentStatus, shippingDate, shipTo, shipFrom, currentLocation, previuosLocation, arrivalDate);
        mDatabaseReference.push().setValue(shipmentDeal);
        //shipmentDeal.setId(mDatabaseReference.push().getKey());
        //DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
       // DatabaseReference quizRef = rootRef.child("shipmentdeals");
       // String id = quizRef.push().getKey();
       // mDatabaseReference.setValue(shipmentDeal);

    }

    private void clean() {
        txtStatus.setText("");
        txtShippingDate.setText("");
        txtShipTo.setText("");
        txtShipFrom.setText("");
        txtCurrentLocation.setText("");
        txtPreviousLocation.setText("");
        txtArrivalDate.setText("");
        txtStatus.requestFocus();
    }
}
