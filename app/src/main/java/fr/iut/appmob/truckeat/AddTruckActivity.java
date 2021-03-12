package fr.iut.appmob.truckeat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.firestore.GeoPoint;

public class AddTruckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_truck);
        FoodTruck foodTruck = new FoodTruck("Quartier du Mont Valérien", "El Restorante", new GeoPoint(48.881707, 2.201134));
        TruckerHelper.addFoodTruck(foodTruck);

    }
}