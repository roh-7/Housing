package com.example.housing.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.housing.R;
import com.example.housing.utils.Members;

import java.util.ArrayList;
import java.util.List;

import static com.example.housing.R.id.member_card;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class MembersAdapter extends RecyclerView.Adapter<MembersAdapter.MembersViewHolder>
{
    List<Members> Members = new ArrayList<Members>();

    public MembersAdapter(List<Members> Members)
    {
        this.Members = Members;
    }


    public static class MembersViewHolder extends RecyclerView.ViewHolder
    {
        CardView cardView;
        TextView memberName;
        TextView memberFlat;
        TextView memberIntercom;

        MembersViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(member_card);
            memberFlat = (TextView) itemView.findViewById(R.id.member_flat_number);
            memberName = (TextView) itemView.findViewById(R.id.member_name);
            memberIntercom = (TextView) itemView.findViewById(R.id.member_intercom_number);
        }
    }

    @Override
    public MembersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_committee, parent, false);
        MembersViewHolder membersViewHolder = new MembersViewHolder(v);
        return membersViewHolder;
    }

    @Override
    public void onBindViewHolder(MembersViewHolder holder, int position) {
        holder.memberIntercom.setText(Members.get(position).getIntercom_no());
        holder.memberFlat.setText(Members.get(position).getFlat_no());
        holder.memberName.setText(Members.get(position).getName());
    }

    @Override
    public int getItemCount() {
        if(Members==null)
            return 0;
        else
            return (int) Members.size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
