package com.example.is3testsproject.ui.store;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.is3testsproject.Models.Users;
import com.example.is3testsproject.R;
import com.example.is3testsproject.databinding.FragmentStoreBinding;
import com.example.is3testsproject.ui.activity.ActivityViewModel;
import com.google.common.collect.Table;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class StoreFragment extends Fragment {

    private FragmentStoreBinding binding;
    private DatabaseReference mDatabase;
    public ArrayList<String> miArreglo = new ArrayList<String>();


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentStoreBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("Users").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    Users user = dataSnapshot.getValue(Users.class);
                    String userName = user.getUserName();
                    Log.e("User: ", "" + userName);
                    miArreglo.add(userName);
                }

                TableLayout list = binding.lista;
                TableRow row = new TableRow(getActivity().getBaseContext());
                TextView txtview;
                Log.e("MiArregloSize", String.valueOf(miArreglo.size()));

                for (int i = 0; i < miArreglo.size(); i++) {
                    txtview = new TextView(getActivity().getBaseContext());
                    txtview.setGravity(Gravity.CENTER_VERTICAL);
                    txtview.setPadding(15, 15, 15, 15);
                    txtview.setBackgroundResource(R.color.colorPrimary);
                    txtview.setText(miArreglo.get(i));
                    txtview.setTextColor(Color.WHITE);
                    row.addView(txtview);

                    txtview = new TextView(getActivity().getBaseContext());
                    txtview.setGravity(Gravity.CENTER_VERTICAL);
                    txtview.setPadding(15, 15, 15, 15);
                    txtview.setBackgroundResource(R.color.colorPrimaryDark);
                    txtview.setText(String.valueOf(1));
                    txtview.setTextColor(Color.WHITE);
                    row.addView(txtview);


                }
                list.addView(row);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });

        return root;

    }
}