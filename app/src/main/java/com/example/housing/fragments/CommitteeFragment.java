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
import com.example.housing.adapters.CommitteeAdapter;
import com.example.housing.model.Committee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class CommitteeFragment extends Fragment {

    private List<Committee> CommitteeMembers = new ArrayList<Committee>();
    RecyclerView recyclerView;
    private static final String LOG_TAG = "CommitteFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_committee,container,false);
        recyclerView = (RecyclerView) view.findViewById(R.id.commitee_recycler_view);
        CommitteeMembers.add(new Committee("Rohit Ramaswamy","Secretary","A-101"));
        CommitteeMembers.add(new Committee("Aditya Nair","Treasurer","D-504"));
        CommitteeMembers.add(new Committee("Aditya Kulkarni","Member","C-803"));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new CommitteeAdapter(CommitteeMembers));
        return view;
    }
}
