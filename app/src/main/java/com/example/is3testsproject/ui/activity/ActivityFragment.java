package com.example.is3testsproject.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.is3testsproject.databinding.FragmentActivityBinding;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.google.android.gms.fitness.request.OnDataPointListener;



import androidx.appcompat.app.AppCompatActivity;

import com.example.is3testsproject.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.ArrayList;

public class ActivityFragment extends Fragment {

    final static String TAG = "SensorFrag";
    TextView logger;
    static final int REQUEST_OAUTH = 1;
    OnDataPointListener mlistener;
    Handler handler;

    // Barchart
    // variable for our bar chart
    BarChart barChart;
    // variable for our bar data.
    BarData barData;
    // variable for our bar data set.vi
    BarDataSet barDataSet;
    // array list for storing entries.
    ArrayList barEntriesArrayList;

    private FragmentActivityBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ActivityViewModel activityViewModel =
                new ViewModelProvider(this).get(ActivityViewModel.class);

        binding = FragmentActivityBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textActivity;
        activityViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        // BarChart
        // initializing variable for bar chart.
        barChart = binding.idBarChart;

        // calling method to get bar entries.
        getBarEntries();

        // creating a new bar data set.
        barDataSet = new BarDataSet(barEntriesArrayList, "Cantidad de Pasos por dia");

        // creating a new bar data and
        // passing our bar data set.
        barData = new BarData(barDataSet);
        // below line is to set data
        // to our bar chart.
        barChart.setData(barData);
        // adding color to our bar data set.
        barDataSet.setColors(ColorTemplate.LIBERTY_COLORS);
        // setting text color.
        barDataSet.setValueTextColor(Color.GREEN);
        // setting text size
        barDataSet.setValueTextSize(16f);
        barChart.getDescription().setEnabled(false);

        return root;
    }

    private void getBarEntries() {
        // creating a new array list
        barEntriesArrayList = new ArrayList<>();

        // adding new entry to our array list with bar
        // entry and passing x and y axis value to it.
        barEntriesArrayList.add(new BarEntry(1f, 4));
        barEntriesArrayList.add(new BarEntry(2f, 6));
        barEntriesArrayList.add(new BarEntry(3f, 8));
        barEntriesArrayList.add(new BarEntry(4f, 2));
        barEntriesArrayList.add(new BarEntry(5f, 4));
        barEntriesArrayList.add(new BarEntry(6f, 1));
        barEntriesArrayList.add(new BarEntry(7f, 13));
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}