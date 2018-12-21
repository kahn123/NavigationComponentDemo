package com.example.navigationcomponentdemo.simple;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.navigationcomponentdemo.R;

import androidx.navigation.Navigation;


public class SecondFragment extends Fragment {

    public SecondFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_second, container, false);

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Button btnToThirdFrag = view.findViewById(R.id.btn_to_third_fragment);
        btnToThirdFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Navigation.findNavController(getView()).navigateUp();
                Navigation.findNavController(getView()).navigate(R.id.action_secondFragment_to_thirdFragment);
            }
        });
    }

}
