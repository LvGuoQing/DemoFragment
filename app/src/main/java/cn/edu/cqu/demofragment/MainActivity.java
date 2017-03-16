package cn.edu.cqu.demofragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<String> myForecastArrayAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
