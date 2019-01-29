package com.tpillon.schoolapplication.Views.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tpillon.schoolapplication.R;
import com.tpillon.schoolapplication.Views.Fragments.FormFragment;
import com.tpillon.schoolapplication.Views.Fragments.SendFragment;

/**
 * principal activity
 */
public class MainActivity extends AppCompatActivity {

    /**
     * fragment to store student
     */
    private SendFragment _sendFragment;

    /**
     * fragment with form about student
     */
    private FormFragment _formFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // collect fragement
        //SOURCE : https://developer.android.com/guide/components/fragments
        // SOURCE lifecycle : https://i.stack.imgur.com/fRxIQ.png
        FragmentManager manager=getSupportFragmentManager();
        _formFragment = (FormFragment) manager.findFragmentById(R.id.fragmentBag);
    }
}
