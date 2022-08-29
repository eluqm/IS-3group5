package com.example.is3testsproject.ui.activity;

import android.graphics.Color;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;



public class ActivityViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ActivityViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");

    }


    public LiveData<String> getText() {
        return mText;
    }
}