package com.example.housing.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.housing.R;
import com.example.housing.adapters.IntercomAdapter;
import com.example.housing.utils.Intercom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class IntercomFragment extends Fragment
{
    private static final String LOG_TAG = "IntercomFragment";

    private List<Intercom> IntercomShortcuts = new ArrayList<Intercom>();
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_intercom,container,false);
        recyclerView = (RecyclerView) view.findViewById(R.id.intercom_recycler_view);
        IntercomShortcuts.add(new Intercom("Main gate","100"));
        IntercomShortcuts.add(new Intercom("A wing","101"));
        IntercomShortcuts.add(new Intercom("B wing","201"));
        IntercomShortcuts.add(new Intercom("C wing","301"));
        IntercomShortcuts.add(new Intercom("D wing","401"));
        IntercomShortcuts.add(new Intercom("E wing","501"));
        IntercomShortcuts.add(new Intercom("Clubhouse","102"));
        IntercomShortcuts.add(new Intercom("Gym","103"));
        IntercomShortcuts.add(new Intercom("Canteen","104"));
        IntercomShortcuts.add(new Intercom("Banquet","105"));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new IntercomAdapter(IntercomShortcuts));


        return view;
    }
}
