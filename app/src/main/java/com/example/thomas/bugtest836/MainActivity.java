package com.example.thomas.bugtest836;

import android.util.Log;

import butterknife.OnClick;

public class MainActivity extends BaseMainActivity {

    private static final String TAG = "MainActivity";

    @Override
    public int getLayout() {
        // TODO Auto-generated method stub
        return R.layout.activity_main;
    }

    @OnClick(R.id.bt_test)
    void onBtclick() {
        if (editQuery != null) {
            Log.i(TAG, "editQuery=" + editQuery.getText().toString());
        } else {
            Log.d(TAG, "EditQuery field not bound");
        }
    }
}