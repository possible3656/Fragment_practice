package com.pscube.fragment_practice;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class showFragment extends Fragment {

    TextView firstName , secondName , thirdName;
    model modelhere;


    public showFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
  View view = inflater.inflate(R.layout.fragment_show, container, false);

  firstName= view.findViewById(R.id.textView_firstName);
  secondName= view.findViewById(R.id.textView_secondName);
  thirdName= view.findViewById(R.id.textView_thirdName);

  firstName.setText(modelhere.getFirstName());
  secondName.setText(modelhere.getSecondName());
  thirdName.setText(modelhere.getThirdName());








  return view;
    }

    public  void retriveingModel(model model){
        modelhere =model;


    }

}
