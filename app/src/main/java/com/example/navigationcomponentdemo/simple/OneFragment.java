package com.example.navigationcomponentdemo.simple;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.navigationcomponentdemo.R;

import androidx.navigation.Navigation;

public class OneFragment extends Fragment {


    public OneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_one, container, false);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OneFragmentArgs oneFragmentArgs = OneFragmentArgs.fromBundle(getArguments());
        String data  = oneFragmentArgs.getData();
        Toast.makeText(getContext(), data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Button btnFirstToSecond = view.findViewById(R.id.btn_to_second_fragment);
        btnFirstToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_nav_first_frag_to_nav_second_frag);
                //Navigation.findNavController(getActivity(), R.id.btn_to_second_fragment).navigate(R.id.action_nav_first_frag_to_nav_second_frag);
                //Navigation.findNavController(getView()).navigate(R.id.action_nav_first_frag_to_nav_second_frag);

                //Bundle bundle = new Bundle();
                //bundle.putString("KEY", "我是从 First 过来的");
                //Navigation.findNavController(getView()).navigate(R.id.action_nav_first_frag_to_nav_second_frag, bundle);
                //Navigation.findNavController(getView()).navigate(R.id.action_nav_first_frag_to_nav_second_frag, bundle);

                //Navigation.findNavController(getView()).popBackStack();
                //Navigation.findNavController(getView()).navigateUp();

//                Navigation.findNavController(getView()).navigate(R.id.action_nav_first_frag_to_nav_second_frag);

                /*SecondFragmentArgs fragmentArgs = new SecondFragmentArgs
                        .Builder(true,
                        1,
                        1.1f,
                        "我是通过 argument 过来的")
                        .build();
                Navigation.findNavController(getView())
                        .navigate(R.id.action_nav_first_frag_to_nav_second_frag, fragmentArgs.toBundle());*/
                Navigation.findNavController(getView()).navigate(R.id.action_oneFragment_to_secondFragment);
            }
        });
    }
}
