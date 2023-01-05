package com.example.todo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spn;
    private ListView lst;
    private Button btn;
    EditText name;
    EditText Salary;
    List<EmploueeInfo> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = findViewById(R.id.spinner);
        lst = findViewById(R.id.listv);
        name= findViewById(R.id.name);
        Salary = findViewById(R.id.salary);
        btn = findViewById(R.id.button);



        list = new ArrayList<>();


        List<String> time = new ArrayList<>();
        time.add("FullTime");
        time.add("PartTime");

        ArrayAdapter<String> adapterTime = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, time);
        spn.setAdapter(adapterTime);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strname = name.getText().toString();
                String strsalary = Salary.getText().toString();


                list.add(new EmploueeInfo(strname,strsalary));

              ArrayAdapter<EmploueeInfo> adapterItems = new ArrayAdapter<EmploueeInfo>(MainActivity.this,
                        android.R.layout.simple_list_item_1, list);
                lst.setAdapter(adapterItems);
            }
        });


    }
}