package cn.com.zzht2;

import com.ant.liao.GifView;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/***
 * �Զ�����صȴ���
 * @author chenzheng_java
 * @version2.0
 *
 */
public class MyCustomDialog extends Dialog {
	private boolean isGif = false;
	private GifView gf1;
	private Context context ;
	private String message = "�����Ժ󣬳������ڼ����С���";
	private int animation_index = R.drawable.common_progress_loading;
	private int gif_index = R.drawable.common_progress_gif;
	/***
	 * �������ݷ�GIF�����ļ��ؿ�
	 * @param context
	 * @param message
	 * @param animationIndex ����
	 */
	public MyCustomDialog(Context context,String message,int animationIndex) {
		super(context,  R.style.common_MyProgress);
		this.context = context;
		this.message = message;
		this.animation_index = (animationIndex==-1?this.animation_index:animationIndex);
		this.isGif = false;
	}
	/***
	 * ��������GIF�����ļ��ؿ�
	 * @param context
	 * @param gif_index
	 * @param message
	 */
	public MyCustomDialog(Context context,int gif_index,String message){
		super(context,  R.style.common_MyProgress);
		this.context = context;
		this.message = message;
		this.isGif = true;
		this.gif_index = (gif_index==-1?this.gif_index:gif_index);
	}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if(isGif)
			createWithGif();
		else
		createWithAnimationDrawable();
		
	}
	 AnimationDrawable animationDrawable2;
	/***
	 * ͨ��animationDrawable������ض���
	 */
	private void createWithAnimationDrawable(){
		View view = LayoutInflater.from(context).inflate(R.layout.common_progress_round2, null);
		
		
		ImageView imageView2 = (ImageView) view.findViewById(R.id.common_progress_image);
        imageView2.setBackgroundResource(animation_index);
        animationDrawable2 = (AnimationDrawable)imageView2.getBackground();
		this.setContentView(view);
	}
	
	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		 animationDrawable2.start();
		 Log.e("thread1 = ", Thread.currentThread().getName());
		super.onWindowFocusChanged(hasFocus);
	}
	
	/***
	 * ͨ��gif�����ļ����ض���
	 */
	private void createWithGif(){
	/*	this.setContentView(R.layout.common_progress_gif);
		TextView textView = (TextView) findViewById(R.id.progress_message);
		textView.setText(message);
		textView.setTextColor(Color.BLACK);
		gf1 = (GifView)findViewById(R.id.gif1);
		gf1.setGifImage(gif_index);*/
	}
	
	@Override
	public void setOnCancelListener(OnCancelListener listener) {
		super.setOnCancelListener(listener);
	}
	
	@Override
	public void dismiss() {
		super.dismiss();
	}
	
	
}
