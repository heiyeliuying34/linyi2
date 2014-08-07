package cn.com.zzht2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressDemoActivity extends Activity implements OnClickListener{
	Button button1 ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }
    
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			showProgress(ProgressDemoActivity.this);
			break;

		default:
			break;
		}
	}
	
	private void showProgress(Context context){
		
		MyCustomDialog customDialog = new MyCustomDialog(context, "Мгдижа", -1);
		customDialog.show();
		
		
		
	}
	
	
	private void test(Context context){
		
		ProgressDialog progressDialog = new ProgressDialog(context);
	}
	
}