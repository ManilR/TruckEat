package fr.iut.appmob.truckeat;

import com.google.android.gms.tasks.Task;
import com.google.firebase. firestore. CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;


public class TruckerHelper {

    private static final String COLLECTION_NAME = "FoodTrucks";

    // --- COLLECTION REFERENCE ---

    public static CollectionReference getFoodTrucksCollection(){
        return FirebaseFirestore.getInstance().collection(COLLECTION_NAME);
    }

    public static Task<DocumentSnapshot> getFoodTruck(String uid){
        return TruckerHelper.getFoodTrucksCollection().document(uid).get();
    }

}
