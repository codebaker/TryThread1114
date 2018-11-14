package com.example.edu.trythread1114;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.btnMainUi)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final String TAG = "ErrorThreadActivityTag";
        long endTime = System.currentTimeMillis() + 2 * 5000;
        Log.e("TAG1","Thread running.");
        TextView threadValue = findViewById(R.id.threadValue);
        while(System.currentTimeMillis()<endTime){
            synchronized (this) {
                Log.i("TAG2", "Thread running.");
                threadValue.setText(String.valueOf(System.currentTimeMillis()));
            }
        }
        switch(v.getId()){
            case R.id.btnMainUi:

                break;
        }
    }
}
