package com.example.shopping_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int VALUE_REQUEST = 1;
    private final TextView[] value = new TextView[10];
    private ArrayList<String> valueList = new ArrayList<>(10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

        value[0] = findViewById(R.id.tvli1);
        value[1] = findViewById(R.id.tvli2);
        value[2] = findViewById(R.id.tvli3);
        value[3] = findViewById(R.id.tvli4);
        value[4] = findViewById(R.id.tvli5);
        value[5] = findViewById(R.id.tvli6);
        value[6] = findViewById(R.id.tvli7);
        value[7] = findViewById(R.id.tvli8);
        value[8] = findViewById(R.id.tvli9);
        value[9] = findViewById(R.id.tvli10);

        if (savedInstanceState != null) {
            valueList = savedInstanceState.getStringArrayList("ValueListStringArray");
            int i;
            if (valueList != null && valueList.size() > 0) {
                for (i = 0; i < valueList.size(); i++) {
                    if (valueList.size() > 10) {
                        Toast.makeText(MainActivity.this, "Cannot add more items to the list", Toast.LENGTH_LONG).show();
                        break;
                    }
                    value[i].setVisibility(View.VISIBLE);
                    value[i].setText(valueList.get(i));
                }
            }
        }

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

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (valueList.size() != 0) {
            outState.putStringArrayList("ValueListStringArray", valueList);
        }
    }

    public void addValue(View view) {
        Intent intent = new Intent(this, Item_Activity.class);
        startActivityForResult(intent, VALUE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == VALUE_REQUEST) {
            if (resultCode == RESULT_OK) {
                String itemString = data.getStringExtra(Item_Activity.EXTRA_VALUE);
                valueList.add(itemString);
                int i;
                for (i = 0; i < valueList.size(); i++) {
                    if (valueList.size() > 10) {
                        Toast.makeText(MainActivity.this, "Cannot add more items to the list", Toast.LENGTH_LONG).show();
                        break;
                    }
                    value[i].setVisibility(View.VISIBLE);
                    value[i].setText(valueList.get(i));
                }

            }
        }
    }
}