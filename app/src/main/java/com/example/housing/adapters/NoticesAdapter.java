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

/**
 * Created by rohitramaswamy on 19/04/17.
 */

public class NoticesAdapter extends RecyclerView.Adapter<NoticesAdapter.NoticesViewHolder>
{
    List<Notices> NoticesList = new ArrayList<Notices>();

    public NoticesAdapter(List<Notices> NoticeList)
    {
        this.NoticesList = NoticeList;
    }

    @Override
    public NoticesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_committee, parent, false);
        NoticesViewHolder noticesViewHolder = new NoticesViewHolder(v);
        return noticesViewHolder;
    }

    @Override
    public void onBindViewHolder(NoticesViewHolder holder, int position) {
        holder.noticesTitle.setText(NoticesList.get(position).getTitle());
        holder.noticesSubtitle.setText(NoticesList.get(position).getSubtitle());
        holder.noticesTime.setText(NoticesList.get(position).getTimestamp());
    }

    @Override
    public int getItemCount() {
        if(NoticesList==null)
            return 0;
        else
            return (int) NoticesList.size();
    }

    public static class NoticesViewHolder extends RecyclerView.ViewHolder
    {
        CardView cardView;
        TextView noticesTitle;
        TextView noticesSubtitle;
        TextView noticesTime;

        NoticesViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.notices_card);
            noticesTitle = (TextView) itemView.findViewById(R.id.notice_title);
            noticesSubtitle = (TextView) itemView.findViewById(R.id.notice_subtitle);
            noticesTime = (TextView) itemView.findViewById(R.id.notice_time);
        }
    }
}
