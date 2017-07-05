package com.mu.example.loading;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    LVRingProgress mLVRingProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLVRingProgress = (LVRingProgress) findViewById(R.id.lv_ringp);
        mLVRingProgress.setViewColor(Color.WHITE);
        mLVRingProgress.setTextColor(Color.BLACK);
        mLVRingProgress.setPorBarStartColor(Color.YELLOW);
        mLVRingProgress.setPorBarEndColor(Color.YELLOW);
    }

    public void startAnim(View v) {

        stopAll();


            ((LVRingProgress) v).startAnim(3000);



    }

    private void stopAll() {

        mLVRingProgress.stopAnim();

    }
}
