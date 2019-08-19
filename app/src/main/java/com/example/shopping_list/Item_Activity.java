package com.example.shopping_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Item_Activity extends AppCompatActivity {

    private static final String LOG_TAG = Item_Activity.class.getSimpleName();
    public static final String EXTRA_VALUE = "com.example.android.shopping_list.extra.VALUE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_);

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");
    }

    @Override
    public void onStart(){
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

    public void selectItem(View view) {
        Intent item_intent = new Intent();

        switch (view.getId()){
            case R.id.btnMilk:
                item_intent.putExtra(EXTRA_VALUE, "Milk"); setResult(RESULT_OK, item_intent); finish();
                break;
            case R.id.btnEggs:
                item_intent.putExtra(EXTRA_VALUE, "Eggs"); setResult(RESULT_OK, item_intent); finish();
                break;
            case R.id.btnBread:
                item_intent.putExtra(EXTRA_VALUE, "Bread"); setResult(RESULT_OK, item_intent); finish();
                break;
            case R.id.btnApple:
                item_intent.putExtra(EXTRA_VALUE, "Apple"); setResult(RESULT_OK, item_intent); finish();
                break;
            case R.id.btnPotato:
                item_intent.putExtra(EXTRA_VALUE, "Potato"); setResult(RESULT_OK, item_intent); finish();
                break;
            case R.id.btnFlour:
                item_intent.putExtra(EXTRA_VALUE, "Flour"); setResult(RESULT_OK, item_intent); finish();
                break;
            case R.id.btnSugar:
                item_intent.putExtra(EXTRA_VALUE, "Sugar"); setResult(RESULT_OK, item_intent); finish();
                break;
            case R.id.btnTomato:
                item_intent.putExtra(EXTRA_VALUE, "Tomato"); setResult(RESULT_OK, item_intent); finish();
                break;
            case R.id.btnOnion:
                item_intent.putExtra(EXTRA_VALUE, "Onion"); setResult(RESULT_OK, item_intent); finish();
                break;
            case R.id.btnChicken:
                item_intent.putExtra(EXTRA_VALUE, "Chicken"); setResult(RESULT_OK, item_intent); finish();
                break;
            case R.id.btnRamen:
                item_intent.putExtra(EXTRA_VALUE, "Ramen"); setResult(RESULT_OK, item_intent); finish();
                break;
            case R.id.btnTea:
                item_intent.putExtra(EXTRA_VALUE, "Tea"); setResult(RESULT_OK, item_intent); finish();
                break;
            case R.id.btnNothing:
                setContentView(R.layout.activity_main);
                break;
            default:
                Toast.makeText(Item_Activity.this, "There was an error", Toast.LENGTH_LONG).show();
                break;
        }

    }
}
