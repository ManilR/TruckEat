package fr.iut.appmob.truckeat;

import android.app.Application;
import android.os.SystemClock;

public class Sleep extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(2000);
    }

}
