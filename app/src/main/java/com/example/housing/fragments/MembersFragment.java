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
import com.example.housing.adapters.MembersAdapter;
import com.example.housing.model.Members;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class MembersFragment extends Fragment
{
	private static final String LOG_TAG = "MembersFragment";

	List<Members> MembersList = new ArrayList<Members>();
	RecyclerView recyclerView;

	private DatabaseReference ref;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.fragment_members, container, false);
		recyclerView = (RecyclerView) view.findViewById(R.id.members_recycler_view);
		MembersList.add(new Members("Mr. Akash", "A-201", "10201"));
		MembersList.add(new Members("Mr. Amey", "A-301", "10301"));
		MembersList.add(new Members("Mr. Arush", "B-401", "20401"));
		MembersList.add(new Members("Mr. Akarsh", "B-501", "20501"));
		MembersList.add(new Members("Mr. Bhat", "E-601", "50601"));
		MembersList.add(new Members("Mr. Bhavik", "C-202", "30202"));
		MembersList.add(new Members("Mr. Bhavin", "D-203", "40203"));
		MembersList.add(new Members("Mr. Chawla", "C-204", "30204"));
		MembersList.add(new Members("Mr. Chawarkar", "B-504", "20504"));
		MembersList.add(new Members("Mr. Prabhu", "A-303", "10303"));
		MembersList.add(new Members("Mr. Kulkarni", "A-401", "10401"));
		MembersList.add(new Members("Mr. Nair", "A-404", "10404"));
		MembersList.add(new Members("Mr. Ramaswamy", "A-403", "10403"));

		recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
		recyclerView.setAdapter(new MembersAdapter(MembersList));
		return view;
	}
}
