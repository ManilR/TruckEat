package fr.iut.appmob.truckeat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.ErrorCodes;
import com.firebase.ui.auth.IdpResponse;
import com.google.android.material.snackbar.Snackbar;

import java.util.Arrays;

import butterknife.BindView;

//Activity to choose between Eater and Trucker mode

public class IdActivity extends BaseActivity  {

    // Identifier for Sign-In Activity
    private static final int RC_SIGN_IN = 123;
    @BindView(R.id.IdActivity_coordinator_layout) CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(this.isCurrentUserLogged()) {
            this.startTruckerActivity();
        } else {
            setContentView(R.layout.activity_id);
        }

    }

    private void startMapsActivity(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    private void startTruckerActivity(){
        Intent intent = new Intent(this, MainTrucker.class);
        startActivity(intent);
    }

    public void connectEater (View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void onClickBtnTrucker(View view){
        this.startSignInActivity();
    }

    private void startSignInActivity() {
        startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setTheme(R.style.LoginTheme)
                        .setAvailableProviders(
                                Arrays.asList(new AuthUI.IdpConfig.EmailBuilder().build()))
                        .setIsSmartLockEnabled(false, true)
                        .build(),
                RC_SIGN_IN);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        this.startTruckerActivity();
        super.onActivityResult(requestCode, resultCode, data);
        finish();
    }
}