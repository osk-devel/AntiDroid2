package com.osk.antidroid2;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import org.apache.http.client.HttpClient;

public class MessageActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("This is the Message tab");
        setContentView(textview);
    }
}
