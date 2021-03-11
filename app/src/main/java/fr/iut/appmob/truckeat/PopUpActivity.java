package fr.iut.appmob.truckeat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;

public class PopUpActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        Intent intent = getIntent();
        String truck = intent.getStringExtra(MapsActivity.EXTRA_MESSAGE);
        Task<DocumentSnapshot> document;
        document = TruckerHelper.getFoodTruck(truck);
        while (!document.isComplete()){

        }
        String nom = (String) document.getResult().get("nom");

        TextView textView = findViewById(R.id.nomTruck);
        textView.setText(nom);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*1),(int)(height*.4));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.BOTTOM;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);
    }

    public void connectMenu (View view){
        Intent intent = getIntent();
        String truck = intent.getStringExtra(MapsActivity.EXTRA_MESSAGE);
        intent = new Intent(this, MenuActivity.class);
        intent.putExtra(MapsActivity.EXTRA_MESSAGE, truck);
        startActivity(intent);
    }
}