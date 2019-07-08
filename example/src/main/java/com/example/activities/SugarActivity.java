package com.example.activities;

import android.app.Activity;
import android.os.Bundle;

import com.example.R;


public class SugarActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        new Model().save();
        new Model(1111L, "2222").save();

    }
}
