package com.starryrain.smalltarget;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TodayAdapter extends RecyclerView.Adapter<TodayAdapter.ViewHolder>{

    private String[] mDataSet;
    public static class ViewHolder extends RecyclerView.ViewHolder{
        //public TextView mTextView;
        public CardView mCardView;
        public ViewHolder(View v) {
            super(v);
            //mTextView = (TextView)v.findViewById(R.id.SingleItem);
            mCardView=(CardView)v.findViewById(R.id.card_view);
        }
    }

    public TodayAdapter(String []myDataSet){
        mDataSet=myDataSet;
    }

    @Override
    public TodayAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        //View view = LayoutInflater.from(parent.getContext())
        //        .inflate(R.layout.my_text_view, parent, false);
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //holder.mTextView.setText(mDataSet[position]);
        TextView textView=(TextView)holder.mCardView.findViewById(R.id.text_desc);
        textView.setText(mDataSet[position]);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataSet.length;

    }
}
