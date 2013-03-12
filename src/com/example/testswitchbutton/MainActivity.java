package com.example.testswitchbutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity
{

    private Switch s;
    private Button bsOn, bsOff, bsClickable, bsUnClickable;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = (Switch) findViewById(R.id.switchBtn);
        bsOn = (Button) findViewById(R.id.button1);
        bsOff = (Button) findViewById(R.id.button2);
        bsClickable = (Button) findViewById(R.id.button3);
        bsUnClickable = (Button) findViewById(R.id.button4);

        bsOn.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                s.setChecked(true);
            }
        });
        bsOff.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                s.setChecked(false);
            }
        });
        bsClickable.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                s.setClickable(true);
            }
        });
        bsUnClickable.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                s.setClickable(false);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
