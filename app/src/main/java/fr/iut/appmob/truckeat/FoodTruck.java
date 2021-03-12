package fr.iut.appmob.truckeat;

import com.google.firebase.firestore.GeoPoint;

public class FoodTruck {

    private String adresse;
    private String nom;
    private String description;
    private GeoPoint geolocalisation;

    public FoodTruck(String adresse, String nom, String description, GeoPoint geolocalisation) {
        this.adresse = adresse;
        this.nom = nom;
        this.description = description;
        this.geolocalisation = geolocalisation;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GeoPoint getGeolocalisation() {
        return geolocalisation;
    }

    public void setGeolocalisation(GeoPoint geolocalisation) {
        this.geolocalisation = geolocalisation;
    }

}
