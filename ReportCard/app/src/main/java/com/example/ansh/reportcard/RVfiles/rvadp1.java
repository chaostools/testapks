package com.example.ansh.reportcard.RVfiles;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ansh.reportcard.R;


/**
 * Created by ansh on 12/11/17.
 */

public class rvadp1 extends RecyclerView.Adapter<RVHolder> {
    String[] data;
    public static final String TAG="rvadp1";

    public rvadp1(String[] data) {
        this.data = data;
        Log.e(TAG, "rvadp1: constructor called.data recieved="+objdetails(data) );
    }

    private String objdetails(String[] data) {
        String a="{";
        for (int i=0;i<data.length;i++) {
            a+=data[i]+",";
        }
        a+="}";
        return  a;
    }

    @Override
    public RVHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v =LayoutInflater.from(parent.getContext()).inflate(R.layout.eachrow,parent,false);
        Log.e(TAG, "onCreateViewHolder: layout inlated" );
        return new RVHolder(v);
    }

    @Override
    public void onBindViewHolder(RVHolder holder, int i) {
        Log.e(TAG, "onBindViewHolder: setting holder data" );

        holder.textiew.setText(data[i]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}
