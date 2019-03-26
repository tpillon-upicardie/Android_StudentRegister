package com.tpillon.schoolapplication.Views.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.tpillon.schoolapplication.Models.Student;
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
        _formFragment = (FormFragment) manager.findFragmentById(R.id.formFragmentContainer);
        _sendFragment = (SendFragment) manager.findFragmentById(R.id.sendFragmentContainer);

    }

    /**
     * function called by click on send button
     * collect student data from view
     * store student
     * @param view
     */
    public void clickToSend(View view) {
        Student student =  _formFragment.collectData();
        _sendFragment.send(student);

        Animation shakeAnim = AnimationUtils.loadAnimation(this, R.anim.shake);
        view.startAnimation(shakeAnim);
        }
}
