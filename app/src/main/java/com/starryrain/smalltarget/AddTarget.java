package com.starryrain.smalltarget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class AddTarget extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.add_target);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar_add_target);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_add_target, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.cancel:
                //// TODO: 2017/4/8 cope with it ! 
                return true;
            case R.id.done:
                //// TODO: 2017/4/8 cope with it ! 
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
