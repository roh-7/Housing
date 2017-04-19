package com.example.housing.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.housing.R;
import com.example.housing.utils.Intercom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class IntercomAdapter extends RecyclerView.Adapter<IntercomAdapter.IntercomViewHolder>
        {
        List<Intercom> IntercomList=new ArrayList<Intercom>();

public IntercomAdapter(List<Intercom> IntercomList)
        {
        this.IntercomList=IntercomList;
        }

@Override
public IntercomViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.design_committee,parent,false);
        IntercomViewHolder intercomViewHolder=new IntercomViewHolder(v);
        return intercomViewHolder;
        }

@Override
public void onBindViewHolder(IntercomViewHolder holder,int position){
        holder.intercomTitle.setText(IntercomList.get(position).getName());
        holder.intercomNumber.setText(IntercomList.get(position).getIntercom_no());
        }

@Override
public int getItemCount(){
        if(IntercomList==null)
        return 0;
        else
        return(int)IntercomList.size();
        }

public static class IntercomViewHolder extends RecyclerView.ViewHolder {
    CardView cardView;
    TextView intercomTitle;
    TextView intercomNumber;

    IntercomViewHolder(View itemView) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.intercom_card);
        intercomNumber = (TextView) itemView.findViewById(R.id.intercom_number);
        intercomTitle = (TextView) itemView.findViewById(R.id.intercom_title);
    }
}

}