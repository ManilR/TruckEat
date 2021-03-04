package fr.iut.appmob.truckeat;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

//Splash Screen with the app's logo

public class SplashActivity extends AppCompatActivity {

    Handler handler;
    Animation rotateAnimation;
    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                imageView = (ImageView)findViewById(R.id.imageRoue);

                rotateAnimation();
                startActivity(intent);
                finish();
            }
        },3000);



    }

    private void rotateAnimation(){

        rotateAnimation= AnimationUtils.loadAnimation(this,R.anim.rotate);
        imageView.startAnimation(rotateAnimation);
    }
}