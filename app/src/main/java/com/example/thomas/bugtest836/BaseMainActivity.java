package com.example.thomas.bugtest836;

import android.widget.EditText;

import butterknife.Bind;


public abstract class BaseMainActivity extends BaseActivity {

    @Bind(R.id.edit_query)
    public EditText editQuery;

}