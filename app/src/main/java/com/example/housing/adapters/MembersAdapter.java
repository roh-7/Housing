package com.example.housing.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.housing.R;
import com.example.housing.model.Members;

import java.util.ArrayList;
import java.util.List;

import static com.example.housing.R.id.member_card;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class MembersAdapter extends RecyclerView.Adapter<MembersAdapter.MembersViewHolder>
{
	List<Members> MembersMembers = new ArrayList<Members>();

	public MembersAdapter(List<Members> MembersMembers)
	{
		this.MembersMembers = MembersMembers;
	}

	@Override
	public MembersViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_members, parent, false);
		MembersViewHolder MembersViewHolder = new MembersViewHolder(v);
		return MembersViewHolder;
	}

	@Override
	public void onBindViewHolder(MembersViewHolder holder, int position)
	{
		holder.MembersName.setText(MembersMembers.get(position).getName());
		holder.MembersIntercom.setText(MembersMembers.get(position).getIntercom_no());
		holder.MembersFlatNo.setText(MembersMembers.get(position).getFlat_no());
	}

	@Override
	public int getItemCount()
	{
		if (MembersMembers == null)
		{ return 0; }
		else
		{ return (int) MembersMembers.size(); }
	}

	public void onAttachedToRecyclerView(RecyclerView recyclerView)
	{
		super.onAttachedToRecyclerView(recyclerView);
	}

	public static class MembersViewHolder extends RecyclerView.ViewHolder
	{
		CardView cardView;
		TextView MembersName;
		TextView MembersIntercom;
		TextView MembersFlatNo;

		MembersViewHolder(View itemView)
		{
			super(itemView);
			cardView = (CardView) itemView.findViewById(member_card);
			MembersName = (TextView) itemView.findViewById(R.id.member_name);
			MembersIntercom = (TextView) itemView.findViewById(R.id.member_intercom_number);
			MembersFlatNo = (TextView) itemView.findViewById(R.id.member_flat_number);
		}
	}


}
