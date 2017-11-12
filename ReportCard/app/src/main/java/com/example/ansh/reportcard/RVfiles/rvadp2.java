package com.example.ansh.reportcard.RVfiles;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ansh.reportcard.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import android.util.Log;


/**
 * Created by ansh on 12/11/17.
 */

public class rvadp2 extends RecyclerView.Adapter<RvHolder2> {
    static HashMap<String,String> data;
    static String[] dataarr;
    public static final String TAG="rvadp2";


    public rvadp2(HashMap<String, String> data) {
        this.data = data;
        Set<String> datalist=  data.keySet();

        dataarr = datalist.toArray(new String[0]);

        Log.e(TAG, "rvadp2: constructor called ." +
                " data recieved="+objdetails(data)+"\ndatarr=:"+objdetails(dataarr));


    }
    private String objdetails(String[] data) {
        String a="{";
        for (int i=0;i<data.length;i++) {
            a+=data[i]+",";
        }
        a+="}";
        return  a;
    }

    public String objdetails(HashMap<String,String> data){
        String a="{ \n\t ";
        for (String i: data.keySet()) {
            a+=i+":"+data.get(i)+" \n\t ";
        }
        a+="}";
        return  a;

    }

    @Override
    public RvHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.eachrow2,parent,false);
        Log.e(TAG, "onCreateViewHolder: layout inlated" );
        return new RvHolder2(v);
    }

    @Override
    public void onBindViewHolder(final RvHolder2 holder, final int i) {
        holder.b.setText(dataarr[i]);
        Log.e(TAG, "onBindViewHolder: setting holder data" );
        holder.b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.t.setText(data.get(dataarr[i]));
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
