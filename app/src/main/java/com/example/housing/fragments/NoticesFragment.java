package com.example.housing.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.housing.R;
import com.example.housing.utils.Notices;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class NoticesFragment extends Fragment
{
    private static final String LOG_TAG = "NoticesFragment";

    List<Notices> NoticesList = new ArrayList<Notices>();
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_notices,container,false);
        recyclerView = (RecyclerView)view.findViewById(R.id.notices_recycler_view);
        NoticesList.add(new Notices("No water","As per BMC Regulation there would be no supply of water tomorrow from 9-11 " +
                "in the morning","17th April 2017"));
        NoticesList.add(new Notices("Elections coming up","The elections for the new committe will be held in " +
                "the clubhouse tomorrow at 3pm","13th April 2017"));
        return view;
    }
}
