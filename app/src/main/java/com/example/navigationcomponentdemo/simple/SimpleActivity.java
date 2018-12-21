package com.example.navigationcomponentdemo.simple;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.navigationcomponentdemo.R;

import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;


public class SimpleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_simple);
        NavGraph navSimple = navHostFragment.getNavController().getNavInflater().inflate(R.navigation.simple_navi);
        NavDestination firstFragDestination = navSimple.findNode(R.id.oneFragment);
        OneFragmentArgs oneFragmentArgs = new OneFragmentArgs.Builder("First数据").build();
        firstFragDestination.setDefaultArguments(oneFragmentArgs.toBundle());
        navHostFragment.getNavController().setGraph(navSimple);

    }

    @Override
    public boolean onSupportNavigateUp() {
        return Navigation.findNavController(this, R.id.fragment_simple).navigateUp();
    }
}
