package fr.iut.appmob.truckeat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id);
    }

    public void connectEater (View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}