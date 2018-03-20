package com.example.housing.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.housing.R;
import com.example.housing.model.Intercom;

import java.util.ArrayList;
import java.util.List;

import static com.example.housing.R.id.intercom_card;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class IntercomAdapter extends RecyclerView.Adapter<IntercomAdapter.IntercomViewHolder>
{
    List<Intercom> IntercomMembers = new ArrayList<Intercom>();

    public IntercomAdapter(List<Intercom> IntercomMembers)
    {
        this.IntercomMembers = IntercomMembers;
    }

    public static class IntercomViewHolder extends RecyclerView.ViewHolder
    {
        CardView cardView;
        TextView IntercomTitle;
        TextView IntercomNumber;

        IntercomViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(intercom_card);
            IntercomTitle = (TextView) itemView.findViewById(R.id.intercom_title);
            IntercomNumber = (TextView) itemView.findViewById(R.id.intercom_number);
        }
    }

    @Override
    public IntercomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_intercom, parent, false);
        IntercomViewHolder IntercomViewHolder = new IntercomViewHolder(v);
        return IntercomViewHolder;
    }

    @Override
    public void onBindViewHolder(IntercomViewHolder holder, int position) {
        holder.IntercomTitle.setText(IntercomMembers.get(position).getName());
        holder.IntercomNumber.setText(IntercomMembers.get(position).getIntercom_no());
    }

    @Override
    public int getItemCount() {
        if(IntercomMembers==null)
            return 0;
        else
            return (int) IntercomMembers.size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
