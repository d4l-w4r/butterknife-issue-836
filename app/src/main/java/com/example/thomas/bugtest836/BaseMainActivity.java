package com.example.thomas.bugtest836;

import android.widget.EditText;

import butterknife.BindView;


public abstract class BaseMainActivity extends BaseActivity {

    @BindView(R.id.edit_query)
    public EditText editQuery;

}