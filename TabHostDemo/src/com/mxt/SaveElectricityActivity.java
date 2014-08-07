package com.mxt;

import android.app.Activity;
import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;

public class SaveElectricityActivity extends ActivityGroup {
  public TabHost tabHost;
  public TabWidget tabWidget;
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Intent BatteryS_Intent=new Intent(this,BatteryState.class);
        Intent SVEMode_Intent=new Intent(this,SVEMode.class);
        Intent Setting_Intent=new Intent(this,Setting.class);
        
        tabHost=(TabHost) this.findViewById(R.id.select);
       tabHost.setup(SaveElectricityActivity.this.getLocalActivityManager());
        Button BatterS_Button=(Button) this.getLayoutInflater().inflate(R.layout.tabs_button, null);
        BatterS_Button.setText("目录1");
        
        Button SVEMode_Button=(Button) this.getLayoutInflater().inflate(R.layout.tabs_button,null);
        SVEMode_Button.setText("目录2");
        
        Button Setting_Button=(Button) this.getLayoutInflater().inflate(R.layout.tabs_button,null);
        Setting_Button.setText("目录3");
        
        //添加tab标签
        tabHost.addTab(tabHost.newTabSpec("0").setContent(BatteryS_Intent).setIndicator(BatterS_Button));
        tabHost.addTab(tabHost.newTabSpec("1").setContent(SVEMode_Intent).setIndicator(SVEMode_Button));
        tabHost.addTab(tabHost.newTabSpec("2").setContent(Setting_Intent).setIndicator(Setting_Button));
        
        tabWidget=tabHost.getTabWidget();
        ((LinearLayout.LayoutParams)BatterS_Button.getLayoutParams()).setMargins(0, 0, 8,0);
        ((LinearLayout.LayoutParams)SVEMode_Button.getLayoutParams()).setMargins(0, 0, 8,0);
        
        
        
    }
}