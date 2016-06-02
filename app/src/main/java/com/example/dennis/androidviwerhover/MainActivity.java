package com.example.dennis.androidviwerhover;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlurLayout sampleLayout = (BlurLayout)findViewById(R.id.sample);
        View hover = LayoutInflater.from(mContext).inflate(R.layout.hover, null);
        sampleLayout.setHoverView(hover);
        //View (R.id.heart) appear animation.
        sampleLayout.addChildAppearAnimator(hover, R.id.heart, Techniques.FlipInX);
        //View (R.id.heart) disappear animation.
        sampleLayout.addChildDisappearAnimator(hover, R.id.heart, Techniques.FlipOutX);
    }
}
