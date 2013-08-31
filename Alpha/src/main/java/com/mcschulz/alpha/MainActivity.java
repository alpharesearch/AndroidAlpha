package com.mcschulz.alpha;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void click1(View view) {
        TextView myview = (TextView) findViewById(R.id.textView);
        myview.setText("test1");
    }

    public void click2(View view) {
        TextView myview = (TextView) findViewById(R.id.textView);
        myview.setText("test2");
    }
}
