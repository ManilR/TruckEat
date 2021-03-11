package fr.iut.appmob.truckeat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.firestore.GeoPoint;

public class AddTruckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_truck);
        FoodTruck foodTruck = new FoodTruck("10 Avenue de l'Italie", "Papa's Freezeria", new GeoPoint(48.829893, 2.356274));
        TruckerHelper.addFoodTruck(foodTruck);
        foodTruck = new FoodTruck("Boulevard du Maréchal Foch", "Super Bowls", new GeoPoint(48.87778, 2.1802832));
        TruckerHelper.addFoodTruck(foodTruck);
    }
}