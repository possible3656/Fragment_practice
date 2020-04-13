package com.pscube.fragment_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements entryFragment.onSaveButtonClicked{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.main_container)!= null) {

            if (savedInstanceState!=null){

             return;
            }

        entryFragment entryFragment = new entryFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.main_container,entryFragment,null)
                .commit();




    }}

    @Override
    public void savebuton(model model) {
        Log.d("tag", "savebuton: "+model.toString());
        showFragment showFragment =  new showFragment();
        showFragment.retriveingModel(model);


      FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_container,showFragment,null);
      fragmentTransaction.commit();


    }
}
