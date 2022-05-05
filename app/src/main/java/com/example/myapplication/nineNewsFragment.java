package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link nineNewsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class nineNewsFragment extends Fragment {



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public nineNewsFragment() {
        // Required empty public constructor

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nineNewsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static nineNewsFragment newInstance(String param1, String param2) {
        nineNewsFragment fragment = new nineNewsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    ArrayList<VerticalModel> verticalModels = new ArrayList<>();
    int[] VerticalImages = {R.drawable.country_detail_pokemon, R.drawable.ff,
            R.drawable.fire, R.drawable.jeeny, R.drawable.mm};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Context context;
        View view =  inflater.inflate(R.layout.fragment_nine_news, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.VerticalRecycler1);


        setUpVerticalModel();
        VerticalAdapter adapter = new VerticalAdapter(this.getContext(), verticalModels);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

     return view;


    }
    private void setUpVerticalModel(){
        String[] verticalNames = getResources().getStringArray(R.array.vertical_name);
        String[] verticalDescription = getResources().getStringArray(R.array.Vertical_Description);

        for( int i =0; i < verticalNames.length; i++)
        {
            verticalModels.add(new VerticalModel(verticalNames[i],
                    verticalDescription[i],VerticalImages[i]));
        }
    }
}