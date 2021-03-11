package fr.iut.appmob.truckeat;

import com.google.firebase.firestore.GeoPoint;

public class FoodTruck {

    private String Adresse;
    private String Nom;
    private GeoPoint Geolocalisation;

    public FoodTruck(String adresse, String nom, GeoPoint geolocalisation) {
        Adresse = adresse;
        Nom = nom;
        Geolocalisation = geolocalisation;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public GeoPoint getGeolocalisation() {
        return Geolocalisation;
    }

    public void setGeolocalisation(GeoPoint geolocalisation) {
        Geolocalisation = geolocalisation;
    }

}
