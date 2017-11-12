package com.example.ansh.reportcard.RVfiles;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ansh.reportcard.R;

/**
 * Created by ansh on 12/11/17.
 */

public class RVHolder extends RecyclerView.ViewHolder {
    TextView textiew;
    public RVHolder(View itemView) {
        super(itemView);
        textiew=itemView.findViewById(R.id.textView);
    }
}
