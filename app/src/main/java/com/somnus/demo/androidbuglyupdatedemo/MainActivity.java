package com.somnus.demo.androidbuglyupdatedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * http://blog.csdn.net/pengyu1801/article/details/53837731
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Bug Fix", Toast.LENGTH_SHORT).show();
    }
}
