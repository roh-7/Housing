package com.example.housing.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.housing.R;
import com.example.housing.utils.Notices;

import java.util.ArrayList;
import java.util.List;

import static com.example.housing.R.id.notices_card;

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class NoticesAdapter extends RecyclerView.Adapter<NoticesAdapter.NoticesViewHolder>
{
    List<Notices> NoticesMembers = new ArrayList<Notices>();

    public NoticesAdapter(List<Notices> NoticesMembers)
    {
        this.NoticesMembers = NoticesMembers;
    }

    public static class NoticesViewHolder extends RecyclerView.ViewHolder
    {
        CardView cardView;
        TextView NoticesTitle;
        TextView NoticesSubtitle;
        TextView NoticesTime;

        NoticesViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(notices_card);
            NoticesTime = (TextView) itemView.findViewById(R.id.notice_time);
            NoticesTitle = (TextView) itemView.findViewById(R.id.notice_title);
            NoticesSubtitle = (TextView) itemView.findViewById(R.id.notice_subtitle);
        }
    }

    @Override
    public NoticesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_notices, parent, false);
        NoticesViewHolder NoticesViewHolder = new NoticesViewHolder(v);
        return NoticesViewHolder;
    }

    @Override
    public void onBindViewHolder(NoticesViewHolder holder, int position) {
        holder.NoticesTime.setText(NoticesMembers.get(position).getTimestamp());
        holder.NoticesSubtitle.setText(NoticesMembers.get(position).getSubtitle());
        holder.NoticesTitle.setText(NoticesMembers.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        if(NoticesMembers==null)
            return 0;
        else
            return (int) NoticesMembers.size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
