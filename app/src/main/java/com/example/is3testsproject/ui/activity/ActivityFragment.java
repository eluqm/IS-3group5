package com.example.is3testsproject.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.is3testsproject.databinding.FragmentActivityBinding;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;



import androidx.appcompat.app.AppCompatActivity;

import com.example.is3testsproject.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.android.gms.fitness.result.DataReadResponse;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    HorizontalBarChart horizontalbarChart;
    // variable for our bar data.
    BarData horizontalbarData;
    // variable for our bar data set.vi
    BarDataSet horizontalbarDataSet;
    // array list for storing entries.
    ArrayList horizontalbarEntriesArrayList;

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
        barChart = binding.idBarChart;
        horizontalbarChart = binding.idhorizontalBarChart;

        getBarEntries();

        return root;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    private void getBarEntries() {
        barEntriesArrayList = new ArrayList<>();
        horizontalbarEntriesArrayList = new ArrayList<>();
        displayLastWeeksData();

    }


    float i = 0.0f;
    float total_steps = 0.0f;
    private Task<DataReadResponse> displayLastWeeksData() {
        // Begin by creating the query.

        Log.i(TAG, "Reading History API results for last 7 days of Steps");
        //First create the DataReadRequest data.
        // Set a start and end time for our query, using a start time of 1 week before this moment.
        Calendar cal = Calendar.getInstance();
        Date now = new Date();
        now.setHours(0);
        now.setMinutes(0);
        now.setSeconds(0);
//        Log.e("DIAACTUAL",cal.)
//        now.set(Calendar.HOUR_OF_DAY, 0);
//        now.set(Calendar.MINUTE, 0);
//        now.set(Calendar.SECOND, 0);
//        now.set(Calendar.MILLISECOND, 0);
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_MONTH,1);
        long endTime = cal.getTimeInMillis();
        cal.add(Calendar.WEEK_OF_YEAR, -1);
        long startTime = cal.getTimeInMillis();


        //show the dates requested
        java.text.DateFormat dateFormat = DateFormat.getDateInstance();


        //Check how many steps were walked and recorded in the last 7 days
        DataReadRequest readRequest = new DataReadRequest.Builder()
                .aggregate(DataType.TYPE_STEP_COUNT_DELTA, DataType.AGGREGATE_STEP_COUNT_DELTA)
                .bucketByTime(1, TimeUnit.DAYS)
                .setTimeRange(startTime, endTime, TimeUnit.MILLISECONDS)
                .build();

        // Agregar Data

        // Now we can return the task object which will run.
        return Fitness.getHistoryClient(requireActivity(), GoogleSignIn.getLastSignedInAccount(requireContext()))
                //.readSession(readRequest)
                .readData(readRequest)
                .addOnSuccessListener(new OnSuccessListener<DataReadResponse>() {
                    @Override
                    public void onSuccess(DataReadResponse dataReadResponse) {
                        // Get a list of the sessions that match the criteria to check the result.
                        //Used for aggregated data
                        if (dataReadResponse.getBuckets().size() > 0) {
                            Log.e("SHOWDATA","Number of buckets: " + dataReadResponse.getBuckets().size());
                            for (Bucket bucket : dataReadResponse.getBuckets()) {
                                List<DataSet> dataSets = bucket.getDataSets();
                                for (DataSet dataSet : dataSets) {
                                    for (DataPoint dp : dataSet.getDataPoints()) {
                                        for (Field field : dp.getDataType().getFields()) {
                                            Log.e("SHOWDATA", "\tField: " + field.getName() +
                                                    " Value: " + dp.getValue(field));

                                            barEntriesArrayList.add(new BarEntry(i,dp.getValue(field).asInt() ));
                                            total_steps = total_steps + dp.getValue(field).asInt();
                                            i = i+1.0f;

                                        }
                                    }

//                                    Log.e("SHOWDATA", String.valueOf(dataSet.getDataPoints().get(0).getValue("DataPoint")));
                                }
                            }

                            barDataSet = new BarDataSet(barEntriesArrayList, "Cantidad de Pasos por dia");
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

                            barChart.setDrawGridBackground(false);
                            barChart.invalidate();


                            total_steps = total_steps * 0.762f /(100*1000);

//                            x1.setValueFormatter((ValueFormatter) months);

                            horizontalbarEntriesArrayList.add(new BarEntry(0.0f,total_steps*2.5f));//Metro
                            horizontalbarEntriesArrayList.add(new BarEntry(1.0f,total_steps*6.2f));//Autobus
                            horizontalbarEntriesArrayList.add(new BarEntry(2.0f,total_steps*12.0f));//Moto
                            horizontalbarEntriesArrayList.add(new BarEntry(3.0f,total_steps*19.0f));//Coche
                            horizontalbarEntriesArrayList.add(new BarEntry(4.0f,total_steps*45.0f));//Avion



                            horizontalbarDataSet = new BarDataSet(horizontalbarEntriesArrayList, "Cantidad de CO2 ahorrado");
                            horizontalbarData = new BarData(horizontalbarDataSet);


                            ArrayList<String> months = new ArrayList<>();
                            months.add("Avion");
                            months.add("Coche");
                            months.add("Moto");
                            months.add("Bus");
                            months.add("Tren");
                            Log.e("SHOWDATANEW", String.valueOf(months));
                            XAxis x1 = horizontalbarChart.getXAxis();

                            x1.setDrawLabels(true);

                            x1.setPosition(XAxis.XAxisPosition.BOTTOM);

                            x1.setDrawGridLines(false);
                            x1.setPosition(XAxis.XAxisPosition.BOTTOM);
                            x1.setGranularity(1.0f);
                            x1.setDrawLabels(true);
                            x1.setDrawAxisLine(false);
                            x1.setValueFormatter(new IndexAxisValueFormatter(months));
                            // below line is to set data
                            // to our bar chart.
                            horizontalbarChart.setData(horizontalbarData);
                            // adding color to our bar data set.
                            horizontalbarDataSet.setColors(ColorTemplate.LIBERTY_COLORS);
                            // setting text color.
                            horizontalbarDataSet.setValueTextColor(Color.GREEN);
                            // setting text size
                            horizontalbarDataSet.setValueTextSize(16f);
                            horizontalbarChart.getDescription().setEnabled(false);
                            horizontalbarChart.setDrawGridBackground(false);
                            horizontalbarChart.invalidate();



                        }
                        //Used for non-aggregated data
                        else if (dataReadResponse.getDataSets().size() > 0) {
                            Log.e("SHOWDATA","Number of returned DataSets: " + dataReadResponse.getDataSets().size());
                            for (DataSet dataSet : dataReadResponse.getDataSets()) {
                                Log.e("SHOWDATA", String.valueOf(dataSet.getDataPoints()));
                            }
                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.e("SHOWDATA","Failed to read DataResponse.");
                    }
                });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}