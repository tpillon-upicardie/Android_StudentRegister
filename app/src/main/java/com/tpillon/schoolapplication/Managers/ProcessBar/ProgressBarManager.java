package com.tpillon.schoolapplication.Managers.ProcessBar;

import android.view.View;
import android.widget.ProgressBar;

public class ProgressBarManager implements IProgressBarManager {

    /**
     * bar to manage
     */
    private ProgressBar _bar;

    public ProgressBarManager( ProgressBar bar) {
        _bar=bar;
        hideBar();
    }

    @Override
    public void setValue(int value) {
        _bar.setProgress(value);
    }

    public void showBar(){
        _bar.setVisibility(View.VISIBLE);
    }
    public void hideBar(){
        _bar.setVisibility(View.INVISIBLE);
    }

    public ProgressBar getBar() {
        return _bar;
    }
    public void setBar(ProgressBar bar) {
        _bar = bar;
    }
}
