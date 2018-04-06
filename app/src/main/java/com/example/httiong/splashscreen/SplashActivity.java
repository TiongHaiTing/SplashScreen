package com.example.httiong.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView tv;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tv =(TextView)findViewById(R.id.msg);
        iv = (ImageView)findViewById(R.id.logo);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        tv.startAnimation(anim);
        iv.startAnimation(anim);

        final Intent i = new Intent(this, HomeActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(i);
                    finish();
                }
            }
        };

        timer.start();
    }
}
