package fr.iut.appmob.truckeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent intent = getIntent();
        String truck = intent.getStringExtra(MapsActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.nomTruck2);
        textView.setText(truck);
    }
}