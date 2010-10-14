package com.osk.antidroid2;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ScrollView;
import android.content.Intent;
import com.osk.antidroid2.SettingProfileActivity;

public class OskConfigActivity extends Activity implements OnClickListener{
	
    Intent intent1;
    Intent intent2;
    Intent intent3;
    Intent intent4;
    Intent intent5;
    
	 public void onClick(View v) 
	 {
		  if(v.equals(findViewById(10000)))
		   startActivity(intent1);
		  else if(v.equals(findViewById(20000)))
		   startActivity(intent2);
		  else if(v.equals(findViewById(30000)))
		   startActivity(intent3);
		  else if(v.equals(findViewById(40000)))
		   startActivity(intent4);
		  else if(v.equals(findViewById(50000)))
		   startActivity(intent5);
	 }
	public RelativeLayout getLayout(int id, int src, String text1, String text2) {
		RelativeLayout item = new RelativeLayout(this);
        ImageView image = new ImageView(this);
        TextView  title = new TextView(this);
        TextView  text  = new TextView(this);
        image.setId(id);
        image.setImageResource(src);
        image.setOnClickListener(this);
        title.setId(id+1);
        title.setText(text1);
        text.setId(id+2);
        text.setText(text2);
        item.addView(image);
        item.addView(title);
        item.addView(text);
        RelativeLayout.LayoutParams item_img_param = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        item_img_param.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        item_img_param.setMargins(0,0,5,0);
        RelativeLayout.LayoutParams item_title_param = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
        item_title_param.addRule(RelativeLayout.RIGHT_OF, image.getId());
        item_title_param.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        item_title_param.setMargins(0,10,0,15); //left top right bottom
        RelativeLayout.LayoutParams item_text_param = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
        item_text_param.addRule(RelativeLayout.RIGHT_OF, image.getId());
        item_text_param.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        item_text_param.addRule(RelativeLayout.BELOW, title.getId());
        image.setLayoutParams(item_img_param);
        title.setLayoutParams(item_title_param);
        text.setLayoutParams(item_text_param);
        text.setTextSize(10);
		return item;
	}
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent1 = new Intent(this, SettingProfileActivity.class);
        intent2 = new Intent(this, SettingProfileActivity.class);
        intent3 = new Intent(this, SettingProfileActivity.class);
        intent4 = new Intent(this, SettingProfileActivity.class);
        intent5 = new Intent(this, SettingProfileActivity.class);
        ScrollView container = new ScrollView(this);
        LinearLayout ConfigLayout = new LinearLayout(this);//(LinearLayout) this.findViewById(R.id.configlayout);
        ConfigLayout.setOrientation(LinearLayout.VERTICAL);
        ConfigLayout.addView(getLayout(10000,R.drawable.android_big,"Profile1", "set your profile."));
        ConfigLayout.addView(getLayout(20000,R.drawable.android_big,"Thingy", "anything you want."));
        ConfigLayout.addView(getLayout(30000,R.drawable.android_big,"Stuffs", "any stuffs you want."));
        ConfigLayout.addView(getLayout(40000,R.drawable.android_big,"hahahaha", "just laughter"));
        ConfigLayout.addView(getLayout(50000,R.drawable.android_big,"nice job!", "yep I know"));
        container.addView(ConfigLayout);
        setContentView(container);
    }
}
