package com.example.ansh.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ansh.reportcard.RVfiles.rvadp1;
import com.example.ansh.reportcard.RVfiles.rvadp2;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private String[] d_myself;
    private HashMap<String, String> d_school;
    private HashMap<String, String> d_year1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.MainRV);
        // rv.setAdapter(new rvadp1(null));
        rv.setLayoutManager(new LinearLayoutManager(this));
        setdataadps();

        Button B_myself = (Button) findViewById(R.id.myself);
        B_myself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rvadp1 adp = new rvadp1(d_myself);
                rv.setAdapter(adp);

            }
        });


        Button B_school = (Button) findViewById(R.id.school);
        B_school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rvadp2 adp = new rvadp2(d_school);
                rv.setAdapter(adp);
            }
        });

        Button B_year1 = (Button) findViewById(R.id.year1);
        B_year1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rvadp2 adp = new rvadp2(d_year1);
                rv.setAdapter(adp);
            }
        });


    }

    private void setdataadps() {
        d_myself = new String[]{"name:ansh", "age:19", "professsion: student,coder", "collage:JIMS,IPU",
                "status:single", "ist sem marks=74%", "sec sem marks=69%",
                "hobbies:listening to music, reading/watching movies/books/movies based on books ,etc",
                "professional skills: C,Java,Python,did some projects on Android",
                "professional courses affiliated:Java core and android Course from Coding Blocks,DWARKA",
                "objectives:willing to work as a team player or as an individual in developing," +
                        " debugging or designing sector;will love to work as a presenter of certain" +
                        " task and express mine or my team's views on it; and willing to work at the " +
                        "inventory sector of the company."
        };
        d_school = new HashMap<>();
        d_school.put("Eng", "68");
        d_school.put("Phy", "76");
        d_school.put("Chem", "93");
        d_school.put("Math", "62");
        d_school.put("ComputerSc", "97.5");
        d_school.put("Physical", "70");
        d_school.put("overall", "76.4%");
        d_school.put("PCM", "75%");
        d_school.put("Best4", "83%");

        d_year1 = new HashMap<>();
        d_year1.put("phy1", "70");
        d_year1.put("phy2", "56");
        d_year1.put("chem1", "80");
        d_year1.put("chem2", "40");
        d_year1.put("elect.tech", "42");
        d_year1.put("elec. devices", "45");
        d_year1.put("math1", "90");
        d_year1.put("math2", "95");
        d_year1.put("mech", "52");
        d_year1.put("manufacturing", "87");
        d_year1.put("FOC", "90");
        d_year1.put("Programming", "95");
        d_year1.put("Overall", "72%");

    }
}

