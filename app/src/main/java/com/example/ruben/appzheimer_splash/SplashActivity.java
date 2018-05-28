package com.example.ruben.appzheimer_splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView a_rojaGrande = (ImageView)findViewById(R.id.logo_rojo_a);
        ImageView tituloVerde = (ImageView)findViewById(R.id.app_verde);
        TextView subtitulo = (TextView)findViewById(R.id.text_splash);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        Animation myanimrotate = AnimationUtils.loadAnimation(this,R.anim.rotation);

        a_rojaGrande.startAnimation(myanim);
        tituloVerde.startAnimation(myanimrotate);
        subtitulo.startAnimation(myanimrotate);

        abrirApp(true);

    }

    private void abrirApp(boolean locationPermission){

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },6000);
    }

}
