package com.example.housing.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.housing.R;
import com.example.housing.model.Committee;

import java.util.ArrayList;
import java.util.List;

import static com.example.housing.R.id.commitee_card;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class CommitteeAdapter extends RecyclerView.Adapter<CommitteeAdapter.CommitteeViewHolder>
{
	List<Committee> CommitteeMembers = new ArrayList<Committee>();

	public CommitteeAdapter(List<Committee> CommitteeMembers)
	{
		this.CommitteeMembers = CommitteeMembers;
	}

	public static class CommitteeViewHolder extends RecyclerView.ViewHolder
	{
		CardView cardView;
		TextView committeeName;
		TextView committeePosition;
		TextView committeeFlatNo;

		CommitteeViewHolder(View itemView)
		{
			super(itemView);
			cardView = (CardView) itemView.findViewById(commitee_card);
			committeeName = (TextView) itemView.findViewById(R.id.committee_name);
			committeePosition = (TextView) itemView.findViewById(R.id.committee_position);
			committeeFlatNo = (TextView) itemView.findViewById(R.id.commitee_flat_no);
		}
	}

	@Override
	public CommitteeViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_committee, parent, false);
		CommitteeViewHolder committeeViewHolder = new CommitteeViewHolder(v);
		return committeeViewHolder;
	}

	@Override
	public void onBindViewHolder(CommitteeViewHolder holder, int position)
	{
		holder.committeeName.setText(CommitteeMembers.get(position).getName());
		holder.committeePosition.setText(CommitteeMembers.get(position).getPosition());
		holder.committeeFlatNo.setText(CommitteeMembers.get(position).getFlat_no());
	}

	@Override
	public int getItemCount()
	{
		if (CommitteeMembers == null)
		{ return 0; }
		else
		{ return (int) CommitteeMembers.size(); }
	}

	public void onAttachedToRecyclerView(RecyclerView recyclerView)
	{
		super.onAttachedToRecyclerView(recyclerView);
	}


}
