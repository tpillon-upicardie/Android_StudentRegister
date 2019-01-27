package com.tpillon.schoolapplication.Managers.ProcessBar;

/**
 * manager to update progress bar
 */
public interface IProgressBarManager {
    /**
     * change progress value in bar
     * @param value : new value to put in the bar
     */
    void setValue(int value);

    /**
     * show the bar in the view
     */
    void showBar();

    /**
     * hide the bar in the view
     */
    void hideBar();
}
