package fr.iut.appmob.truckeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent intent = getIntent();
        String truck = intent.getStringExtra(MapsActivity.EXTRA_MESSAGE);


        Task<DocumentSnapshot> document;
        document = TruckerHelper.getFoodTruck(truck);
        while (!document.isComplete()){

        }
        String nom = (String) document.getResult().get("nom");
        TextView textView = findViewById(R.id.nomTruck2);
        textView.setText(nom);
    }
}