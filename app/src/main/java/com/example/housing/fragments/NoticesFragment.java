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
import com.example.housing.adapters.NoticesAdapter;
import com.example.housing.model.Notices;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class NoticesFragment extends Fragment
{
	RecyclerView recyclerView;
	private List<Notices> NoticesList = new ArrayList<Notices>();

	private DatabaseReference ref;

	private Query query;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.fragment_notices, container, false);
		recyclerView = (RecyclerView) view.findViewById(R.id.notices_recycler_view);

		ref = FirebaseDatabase.getInstance().getReference("/committee");

//		NoticesList.add(new Notices("No water", "As per BMC Regulation there would be no supply of water tomorrow from 9-11 " +
//				"in the morning", "hihi"));
//		NoticesList.add(new Notices("Elections coming up", "The elections for the new committe will be held in " +
//				"the clubhouse tomorrow at 3pm", "hiho"));



		query = ref.limitToFirst(50);



		query.addChildEventListener(new ChildEventListener()
		{
			@Override
			public void onChildAdded(DataSnapshot dataSnapshot, String s)
			{
				NoticesList.add(dataSnapshot.getValue(Notices.class));
			}

			@Override
			public void onChildChanged(DataSnapshot dataSnapshot, String s)
			{

			}

			@Override
			public void onChildRemoved(DataSnapshot dataSnapshot)
			{

			}

			@Override
			public void onChildMoved(DataSnapshot dataSnapshot, String s)
			{

			}

			@Override
			public void onCancelled(DatabaseError databaseError)
			{

			}
		});




		recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
		recyclerView.setAdapter(new NoticesAdapter(NoticesList));

		return view;
	}
}
