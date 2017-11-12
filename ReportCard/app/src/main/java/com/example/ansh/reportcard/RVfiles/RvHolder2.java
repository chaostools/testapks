package com.example.ansh.reportcard.RVfiles;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ansh.reportcard.R;



/**
 * Created by ansh on 12/11/17.
 */

public class RvHolder2  extends RecyclerView.ViewHolder {
    Button b;
    TextView t;
    public RvHolder2(View itemView) {
        super(itemView);
        b=itemView.findViewById(R.id.subjectbutton);
        t=itemView.findViewById(R.id.marksbox);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText(rvadp2.data.get(rvadp2.dataarr[getAdapterPosition()]));
            }
        });

    }
}
