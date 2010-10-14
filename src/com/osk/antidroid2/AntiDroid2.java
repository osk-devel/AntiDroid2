package com.osk.antidroid2;

import com.osk.antidroid2.OskMapActivity;
import com.osk.antidroid2.OskConfigActivity;
import com.osk.antidroid2.MessageActivity;
import android.app.TabActivity;
import 	android.content.res.Resources;
import 	android.widget.TabHost;
import android.content.Intent;

import android.os.Bundle;

public class AntiDroid2 extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, OskMapActivity.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("map").setIndicator("Where am I?",
                          res.getDrawable(R.drawable.ic_tab_map))
                      .setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, OskConfigActivity.class);
        
        spec = tabHost.newTabSpec("config").setIndicator("Configuration",
                          res.getDrawable(R.drawable.ic_tab_config))
                      .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, MessageActivity.class);
        
        spec = tabHost.newTabSpec("message").setIndicator("Message",
                          res.getDrawable(R.drawable.ic_tab_message))
                      .setContent(intent);
        tabHost.addTab(spec);
        
        tabHost.setCurrentTab(0);
    }
}