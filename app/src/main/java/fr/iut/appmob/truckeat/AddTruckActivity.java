package fr.iut.appmob.truckeat;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.firestore.GeoPoint;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class AddTruckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_truck);


    }

    public void onClickBtnAjouter(View view){
        EditText editNom = findViewById(R.id.field_nom);
        String nom = editNom.getText().toString();
        EditText editAdresse = findViewById(R.id.field_adresse);
        String adresse = editAdresse.getText().toString();
        EditText editMot = findViewById(R.id.field_mot);
        String mot = editMot.getText().toString();

        Geocoder geocoder = new Geocoder(this, Locale.getDefault());
        double lat = 0;
        double longi = 0;
        try {
            ArrayList<android.location.Address> adresses = (ArrayList<Address>) geocoder.getFromLocationName(adresse, 1);
            lat = adresses.get(0).getLatitude();
            longi = adresses.get(0).getLongitude();
        } catch (IOException e) {
        }

        if(nom != null && adresse != null && mot != null){
            FoodTruck foodTruck = new FoodTruck(adresse, nom, mot, new GeoPoint(lat, longi));
            TruckerHelper.addFoodTruck(foodTruck);
        }
    }
}