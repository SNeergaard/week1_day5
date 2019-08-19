package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    private int count = 0;
    //Button btnCounter;
    private TextView tvCounter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

        tvCounter = findViewById(R.id.tvCounter);
        //btnCounter= findViewById(R.id.btnCounter);

//        if (savedInstanceState != null) {
//            String i = savedInstanceState.getString("count_value");
//            tvCounter.setText(i);
//            count = Integer.parseInt(i);
//        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

//    @Override
//    public void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putString("count_value", tvCounter.getText().toString());
//    }

    //@Override
    protected void countUp(View view){
        count++;
        //count.toString();
        tvCounter.setText(String.valueOf(count));
    }
}
