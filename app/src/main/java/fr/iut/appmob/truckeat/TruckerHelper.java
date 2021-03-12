package fr.iut.appmob.truckeat;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase. firestore. CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;


public class TruckerHelper {

    private static final String COLLECTION_NAME = "FoodTrucks";

    // --- COLLECTION REFERENCE ---

    public static CollectionReference getFoodTrucksCollection(){
        return FirebaseFirestore.getInstance().collection(COLLECTION_NAME);
    }

    public static Task<DocumentSnapshot> getFoodTruck(String uid){
        return TruckerHelper.getFoodTrucksCollection().document(uid).get();
    }

    public static void addFoodTruck(FoodTruck trucker){
        TruckerHelper.getFoodTrucksCollection().document(trucker.getNom()).set(trucker);
        Task<DocumentSnapshot> document = getFoodTruck("MetaData");
        while (!document.isComplete()){

        }
        Long nb = (Long) document.getResult().get("nb");
        ArrayList<String> ids = (ArrayList<String>) document.getResult().get("id");
        ids.add(trucker.getNom());
        TruckerHelper.getFoodTrucksCollection().document("MetaData").update("id", ids);
        TruckerHelper.getFoodTrucksCollection().document("MetaData").update("nb", nb + 1);

    }

}
