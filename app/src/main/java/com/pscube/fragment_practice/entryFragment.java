package com.pscube.fragment_practice;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class entryFragment extends Fragment {
    private EditText firstName , secondName , thirdName;
    private Button buttonSave;
    private onSaveButtonClicked buttonClicked;



    public interface onSaveButtonClicked{

        public void savebuton(model model);

    }


    public entryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_entry, container, false);

        firstName = view.findViewById(R.id.first_name);
        secondName = view.findViewById(R.id.second_name);
        thirdName = view.findViewById(R.id.third_name);
        buttonSave=view.findViewById(R.id.button_save);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                      if (!firstName.getText().toString().isEmpty()
                        && !secondName.getText().toString().isEmpty()
                        && !thirdName.getText().toString().isEmpty()){

                model model =  new model();
                model.setFirstName(firstName.getText().toString());
                model.setSecondName(secondName.getText().toString());
                model.setThirdName(thirdName.getText().toString());

                buttonClicked.savebuton(model);


            }
            else {

                    Toast.makeText(getContext(), "enter the details", Toast.LENGTH_SHORT).show();

                }
            }
        });



        return view;

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if (context instanceof onSaveButtonClicked){

        buttonClicked= (onSaveButtonClicked) context;
        }
   }

    @Override
    public void onResume() {
        super.onResume();
        firstName.setText("");
        secondName.setText("");
        thirdName.setText("");

    }
}
